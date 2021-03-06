package com.iwhalecloud.retail.offer.dto.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品详情封装的tag
 * @author fanxiaofei
 * @date 2019/02/28
 */
@Data
public class TagResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标签ID")
    private String tagId;

    @ApiModelProperty(value = "标签名称")
    private String tagName;

    @ApiModelProperty(value = "标签说明")
    private String tagDesc;

    @ApiModelProperty(value = "标签样式")
    private Integer tagType;

    @ApiModelProperty(value = "标签颜色")
    private String tagColor;

    @ApiModelProperty(value = "更新时间")
    private Date updDate;
}

