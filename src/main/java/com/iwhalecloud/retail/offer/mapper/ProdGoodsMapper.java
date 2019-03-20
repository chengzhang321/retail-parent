package com.iwhalecloud.retail.offer.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iwhalecloud.retail.offer.dto.ProdGoodsDTO;
import com.iwhalecloud.retail.offer.dto.req.ProdGoodsQueryReq;
import com.iwhalecloud.retail.offer.dto.req.PublishGoodReq;
import com.iwhalecloud.retail.offer.dto.resp.RightsGoodsResp;
import com.iwhalecloud.retail.offer.entity.ProdGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author fanxiaofei
 * @date 2019/02/28
 */
@Mapper
public interface ProdGoodsMapper extends BaseMapper<ProdGoods> {

    /**
     * 商品列表查询（分页）
     * @param page Page<ProdGoodsDTO>
     * @param req ProdGoodsQueryReq
     * @return Page<ProdGoodsDTO>
     */
    Page<ProdGoodsDTO> queryGoodsForPage(Page<ProdGoodsDTO> page, @Param("req") ProdGoodsQueryReq req);

    int goodsPublish(@Param("goodsId") String goodsId, @Param("req") PublishGoodReq req);

    int goodsUnpublish(@Param("goodsId") String goodsId);

    List<ProdGoodsDTO> queryGoodsList(@Param("req") ProdGoodsQueryReq req);

    ProdGoods qryGoodsBySn(@Param("sn") String sn);

    ProdGoods selectByGoodsId(@Param("goodsId") String goodsId);

    void deleteProdGoods(@Param("goodsId") String goodsId);

    void batchDeleteProdGoods(@Param("goodsIdArray") String[] goodsIdArray);

    /**
     * 根据商品id查询商品名称
     * @param goodsIdList 商品id集合
     * @return List<RightsGoodsResp>
     */
    List<RightsGoodsResp> queryGoodsNameByGoodsId(@Param("goodsIdList") List<String> goodsIdList);
}
