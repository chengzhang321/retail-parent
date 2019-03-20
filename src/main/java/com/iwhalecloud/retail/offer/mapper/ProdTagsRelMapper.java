package com.iwhalecloud.retail.offer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iwhalecloud.retail.offer.dto.resp.TagResp;
import com.iwhalecloud.retail.offer.entity.ContactChannel;
import com.iwhalecloud.retail.offer.entity.ProdTagsRel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author fanxiaofei
 * @date 2019/03/04
 */
@Mapper
public interface ProdTagsRelMapper extends BaseMapper<ProdTagsRel> {

    /**
     * 商品下所有标签
     * @param goodsId String
     * @return List<TagResp>
     */
    List<TagResp> listTagByProdGoodsId(@Param("goodsId") String goodsId);

    /**
     * 商品下所有标签id
     * @param goodsId String
     * @return List<String>
     */
    List<String> listTagIdByProdGoodsId(@Param("goodsId") String goodsId);
    
    /**
     * 
     * Description: 查询所有商品标签<br> 
     *  
     * @author wang.zhongbao<br>
     * @taskId <br>
     * @param typeId
     * @return <br>
     */
    List<TagResp> listTagBytypeId(@Param("typeId") Long typeId);


    /**
     * 删除商品的所有标签
     * @param goodsId
     */
    void deleteByGoodsId(@Param("goodsId") String goodsId);
    
    

}
