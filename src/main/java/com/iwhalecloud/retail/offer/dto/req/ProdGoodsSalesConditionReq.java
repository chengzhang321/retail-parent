package com.iwhalecloud.retail.offer.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品适用规则
 * @author fanxiaofei
 * @date 2019-03-01
 */
@Data
public class ProdGoodsSalesConditionReq implements Serializable {

	private static final long serialVersionUID = 1L;


  	/**
  	 * 商品id
  	 */
	@ApiModelProperty(value = "商品id")
  	private String goodsId;
  	
  	/**
  	 * 销售规则标识
  	 */
	@ApiModelProperty(value = "销售规则标识")
  	private Integer salesRuleId;

	/**
	 * 销售规则对象标识
	 */
	@ApiModelProperty(value = "销售规则对象标识")
	private String objId;

}
