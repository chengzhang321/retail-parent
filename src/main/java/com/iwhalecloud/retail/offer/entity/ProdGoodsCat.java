package com.iwhalecloud.retail.offer.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/25 <br>
 * @see com.iwhalecloud.retail.offer.entity <br>
 * @since V9.0C<br>
 */
@Data
@ApiModel(value = "对应模型prod_goods_cat, ProdGoodsCat")
public class ProdGoodsCat implements Serializable {

    /**表名常量*/
    public static final String TNAME = "prod_goods_cat";

    private static final long serialVersionUID = -867713730446451167L;

    /**
     * 目录标识
     */
    @TableId(type = IdType.INPUT)
    @ApiModelProperty(value = "目录标识")
    private String catId;

    /**
     * 目录名称
     */
    @ApiModelProperty(value = "目录名称")
    private String name;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String catType;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String comments;

    /**
     * 店铺
     */
    @ApiModelProperty(value = "店铺")
    private String storeId;

    /**
     * 上级目录标识
     */
    @ApiModelProperty(value = "上级目录标识")
    private String parentId;

    /**
     * LOGO
     */
    @ApiModelProperty(value = "LOGO")
    private String logo;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Long catOrder;

    /**
     * TANANT_ID
     */
    @ApiModelProperty(value = "TANANT_ID")
    private Long tanantId;

}
