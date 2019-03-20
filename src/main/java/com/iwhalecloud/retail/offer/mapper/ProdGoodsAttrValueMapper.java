package com.iwhalecloud.retail.offer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iwhalecloud.retail.offer.dto.req.ProdGoodsAttrValueReq;
import com.iwhalecloud.retail.offer.dto.resp.AttrValueResp;
import com.iwhalecloud.retail.offer.entity.ProdGoodsAttrValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author fanxiaofei
 * @date 2019/02/28
 */
@Mapper
public interface ProdGoodsAttrValueMapper extends BaseMapper<ProdGoodsAttrValue> {

    /**
     * 商品下的商品属性值
     * @param goodsId String
     * @return List<AttrValueResp>
     */
    List<AttrValueResp> listAttrValueRespByProdGoodsId(String goodsId);

    /**
     * 删除商品属性值
     * @param goodsId 商品id
     * @param attrId 属性id
     */
    void deleteProdGoodsAttrValue(@Param("goodsId") String goodsId, @Param("attrId") String attrId);

    /**
     * 修改商品属性值
     * @param req ProdGoodsAttrValueReq
     */
    void editProdGoodsAttrValue(ProdGoodsAttrValueReq req);
}
