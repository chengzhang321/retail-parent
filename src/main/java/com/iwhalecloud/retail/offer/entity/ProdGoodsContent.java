package com.iwhalecloud.retail.offer.entity;

import java.io.Serializable;
import java.util.Date;

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
 * @CreateDate 2019/3/8 <br>
 * @see com.iwhalecloud.retail.offer.entity <br>
 * @since V9.0C<br>
 */
@Data
@ApiModel(value = "对应模型PROD_GOODS_CONTENT, ProdGoodsContent")
public class ProdGoodsContent implements Serializable {

    /**表名常量*/
    public static final String TNAME = "PROD_GOODS_CONTENT";

    private static final long serialVersionUID = -207797865413163256L;

    /**
     *  商品内容标识
     */
    @TableId(type = IdType.INPUT)
    @ApiModelProperty(value = "商品内容标识")
    private String goodsContentId;

    @ApiModelProperty(value = "商品标识")
    private String goodsId;

    @ApiModelProperty(value = "商品内容类型")
    private Long goodsContentType;

    @ApiModelProperty(value = "内容标识")
    private String contenId;

    @ApiModelProperty(value = "状态")
    private String state;

    @ApiModelProperty(value = "状态时间")
    private Date stateDate;

    @ApiModelProperty(value = "创建时间")
    private Date createdDate;

    @ApiModelProperty(value = "创建者")
    private String userId;

}
