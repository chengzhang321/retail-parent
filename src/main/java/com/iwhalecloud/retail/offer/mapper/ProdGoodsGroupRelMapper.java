package com.iwhalecloud.retail.offer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iwhalecloud.retail.offer.entity.ProdGoods;
import com.iwhalecloud.retail.offer.entity.ProdGoodsGroupRel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author fanxiaofei
 * @date 2019/03/03
 */
@Mapper
public interface ProdGoodsGroupRelMapper extends BaseMapper<ProdGoodsGroupRel> {

    /**
     * 根据商品包id查询该包下所有商品id
     * @param packageGoodsId String
     * @return List<String>
     */
    List<ProdGoods> listProdGoodsByPackageGoodsId(@Param("packageGoodsId") String packageGoodsId);
}
