package com.iwhalecloud.retail.offer.dto.req;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <Description> <br>
 *
 * @author yang.bo27<br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2019/2/15 <br>
 * @see com.iwhalecloud.retail.offer.dto.req <br>
 * @since IOT <br>
 */
@Data
public class ProdGoodsQueryReq extends AbstractPageReq {

    /**
     * 商品ID列表
     */
    @ApiModelProperty(value = "商品ID列表")
    private List<String> ids;

    /**
     * 商品分类id
     */
    @ApiModelProperty(value = "商品分类id")
    private String catId;

    /**
     * 关键词搜索
     */
    @ApiModelProperty(value = "关键词搜索")
    private String searchKey;

    /**
     * 上下架状态
     */
    @ApiModelProperty(value = "上下架状态")
    private String marketEnable;

    /**
     * 类型ID列表
     */
    @ApiModelProperty(value = "类型ID列表")
    private List<String> typeIds;

    /**
     * 品牌ID
     */
    @ApiModelProperty(value = "品牌ID")
    private String brandId;

    /**
     * 排序类型值
     * com.iwhalecloud.retail.goods.common.GoodsConst.SortTypeEnum
     */
    private String sortType;
}

