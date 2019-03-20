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
 * @CreateDate 2019/2/28 <br>
 * @see com.iwhalecloud.retail.offer.entity <br>
 * @since V9.0C<br>
 */
@Data
@ApiModel(value = "对应模型prod_goods_cat_mem, ProdGoodsCatMem")
public class ProdGoodsCatMem implements Serializable {

    /**表名常量*/
    public static final String TNAME = "prod_goods_cat_mem";

    private static final long serialVersionUID = 1279261246252263880L;

    /**
     * 目录成员标识
     */
    @TableId(type = IdType.INPUT)
    @ApiModelProperty(value = "目录成员标识")
    private String catMemId;

    /**
     * 目录标识
     */
    @ApiModelProperty(value = "目录标识")
    private String catId;

    /**
     * 商品标识
     */
    @ApiModelProperty(value = "商品标识")
    private String goodsId;
}
