package com.iwhalecloud.retail.offer.dto.resp;

import com.iwhalecloud.retail.offer.entity.ProdGoods;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 商品详情
 * @author fanxiaofei
 * @date 2019/02/28
 */
@Data
public class ProdGoodsDetailByIdResp implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id")
    private String goodsId;

    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称")
    private String name;

    /**
     * 商品编码
     */
    @ApiModelProperty(value = "商品编码")
    private String sn;

    /**
     * 品牌id
     */
    @ApiModelProperty(value = "品牌id")
    private String brandId;

    /**
     * 类型id
     */
    @ApiModelProperty(value = "类型id 1.终端 2.套餐 3.配件 4.合约计划 5.其它 6.券类 7.内容会员 8 权益")
    private String typeId;

    /**
     * 类型名称
     */
    @ApiModelProperty(value = "类型名称")
    private String typeName;

    /**
     * 重量
     */
    @ApiModelProperty(value = "重量")
    private Double weight;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态 A 新建  B 待发布  C 已发布  X 失效")
    private String state;

    /**
     * 介绍
     */
    @ApiModelProperty(value = "介绍")
    private String intro;

    /**
     * 售后
     */
    @ApiModelProperty(value = "售后")
    private String afterSale;

    /**
     * 销售价
     */
    @ApiModelProperty(value = "销售价")
    private Long price;

    /**
     * 成本价
     */
    @ApiModelProperty(value = "成本价")
    private Long cost;

    /**
     * 市场价
     */
    @ApiModelProperty(value = "市场价")
    private Long mktprice;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date lastModify;

    /**
     * 查看次数
     */
    @ApiModelProperty(value = "查看次数")
    private Long viewCount;

    /**
     * 购买数
     */
    @ApiModelProperty(value = "购买数")
    private Long buyCount;

    /**
     * 优先级
     */
    @ApiModelProperty(value = "优先级")
    private Long sord;

    /**
     * 商品发布人
     */
    @ApiModelProperty(value = "商品发布人")
    private String creatorUser;

    /**
     * 副标题
     */
    @ApiModelProperty(value = "副标题")
    private String simpleName;

    /**
     * 最小量
     */
    @ApiModelProperty(value = "最小量")
    private Long minNim;

    /**
     * _商家_分类_品牌_商品名称_ search_key like %%
     */
    @ApiModelProperty(value = "_商家_分类_品牌_商品名称_ search_key like %%")
    private String searchKey;

    /**
     * 卖点
     */
    @ApiModelProperty(value = "卖点")
    private String sellingPoint;

    /**
     * 地市编码
     */
    @ApiModelProperty(value = "地市编码")
    private String regionId;

    /**
     * 地市名称
     */
    @ApiModelProperty(value = "地市名称")
    private String regionName;

    /**
     * 上架时间
     */
    @ApiModelProperty(value = "上架时间")
    private Date marketingBeginTime;

    /**
     * 下架时间
     */
    @ApiModelProperty(value = "下架时间")
    private Date marketingEndTime;

    /**
     * 库存数量
     */
    @ApiModelProperty(value = "库存数量")
    private Long stockQty;

    /**
     * 产品编码
     */
    @ApiModelProperty(value = "产品编码")
    private String productCode;

    /**
     * 重复订购标志
     */
    @ApiModelProperty(value = "重复订购标志")
    private String duplicateFlag;

    /**
     * 允许的最大订购数量
     */
    @ApiModelProperty(value = "允许的最大订购数量")
    private Long maxBuyCount;

    /**
     * 店铺id
     */
    @ApiModelProperty(value = "店铺id")
    private String storeId;

    /**
     * 是否商品包 Y是 N不是
     * 默认N
     */
    @ApiModelProperty(value = "是否商品包 Y是 N不是 默认N")
    private String isPackage;

    /**
     * 调度单标识
     */
    @ApiModelProperty(value = "调度单标识")
    private String dispatchOrderId;

    /**
     * 缩略图
     */
    @ApiModelProperty(value = "缩略图")
    private String thumbnail;

    private String saleCatId;

    private String saleCatName;

    /**
     * 暂时不管,以后封库封表用
     */
    @ApiModelProperty(value = "tanantId")
    private Long tanantId;

    @ApiModelProperty(value = "商品目录")
    private List<ProdGoodsCatMemResp> prodGoodsCatList;

    @ApiModelProperty(value = "商品包成员")
    private List<ProdGoods> pkgMemList;

    @ApiModelProperty(value = "商品关系")
    private List<ProdGoodsRelResp> prodGoodsRelList;

    @ApiModelProperty(value = "属性")
    private List<AttrValueResp> attrValueRespList;

    @ApiModelProperty(value = "标签")
    private List<String> tagIdList;

    @ApiModelProperty(value = "商品适用规则")
    private List<ProdGoodsSalesRuleResp> prodGoodsSaleRuleList;

    @ApiModelProperty(value = "自动库存上下架")
    private List<ProdGoodsStockWaveResp> prodGoodsStockWaveList;

}

