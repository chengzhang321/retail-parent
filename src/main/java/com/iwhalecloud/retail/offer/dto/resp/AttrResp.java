package com.iwhalecloud.retail.offer.dto.resp;

import com.iwhalecloud.retail.offer.entity.AttrValue;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 商品详情封装的attr
 * @author fanxiaofei
 * @date 2019/03/06
 */
@Data
public class AttrResp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    @ApiModelProperty(value = "属性id")
    private String attrId;

    /**
     * 属性名称
     */
    @ApiModelProperty(value = "属性名称")
    private String attrName;

    /**
     * 属性编码
     */
    @ApiModelProperty(value = "属性编码")
    private String attrCode;

    /**
     * 属性类型
     */
    @ApiModelProperty(value = "属性类型 A:规格属性 B:实例化属性 C:SKU属性")
    private String attrType;

    /**
     * 优先级
     */
    @ApiModelProperty(value = "优先级")
    private Integer priority;

    /**
     * 录入类型
     */
    @ApiModelProperty(value = "录入类型")
    private Integer inputType;

    /**
     * 是否为空
     */
    @ApiModelProperty(value = "Y:可空 N:非空")
    private String nullable;

    /**
     * 说明
     */
    @ApiModelProperty(value = "说明")
    private String comments;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createdDate;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    private String createdUserId;


    @ApiModelProperty(value = "属性值")
    private List<AttrValue> attrValueList;

}

