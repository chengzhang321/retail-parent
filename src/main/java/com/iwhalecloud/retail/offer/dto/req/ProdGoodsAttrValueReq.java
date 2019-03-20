package com.iwhalecloud.retail.offer.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品属性值
 * @author fanxiaofei
 * @date 2019-03-01
 */
@Data
public class ProdGoodsAttrValueReq implements Serializable {

	private static final long serialVersionUID = 1L;

  	/**
  	 * 商品id
  	 */
	@ApiModelProperty(value = "商品id")
  	private String goodsId;
  	
  	/**
  	 * 属性id
  	 */
	@ApiModelProperty(value = "属性id")
  	private String attrId;
  	
  	/**
  	 * 属性值
  	 */
	@ApiModelProperty(value = "属性值")
  	private String attrValue;

	/**
	 * 优先级
	 */
	@ApiModelProperty(value = "优先级")
	private Integer priority;

	/**
	 * tanantId
	 */
	@ApiModelProperty(value = "tanantId")
	private Integer tanantId;

}
