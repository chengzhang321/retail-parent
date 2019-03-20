package com.iwhalecloud.retail.offer.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 查询用户权益
 * @author fanxiaofei
 * @date 2019-03-14
 */
@Data
public class RightsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "权益编码")
	private String rightsCode;

	@ApiModelProperty(value = "权益描述")
	private String description;

	@ApiModelProperty(value = "优惠券到期时间")
	private String validityTime;

	@ApiModelProperty(value = "优惠券列表")
	private List<RightsCouponDTO> coupons;

	@ApiModelProperty(value = "商品列表")
	private List<RightsGoodsDTO> offers;
}
