package com.iwhalecloud.retail.offer.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
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
@TableName("goods_content_type")
public class GoodsContentType implements Serializable {

    private static final long serialVersionUID = -1159679791916672307L;

    @TableId(type = IdType.INPUT)
    @ApiModelProperty(value = "商品内容类型标识")
    private Long goodsContentType;

    @ApiModelProperty(value = "名称")
    private String contentTypeName;

    @ApiModelProperty(value = "描述")
    private String comments;
}
