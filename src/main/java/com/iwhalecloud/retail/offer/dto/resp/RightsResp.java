package com.iwhalecloud.retail.offer.dto.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 查询用户权益出参
 * @author fanxiaofei
 * @date 2019-03-14
 */
@Data
public class RightsResp implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "权益编码")
	private String code;

	@ApiModelProperty(value = "权益描述")
	private String description;

	@ApiModelProperty(value = "优惠券到期时间")
	private String validityTime;

	@ApiModelProperty(value = "权益关联商品编号")
	private String relationGoodsId;

	@ApiModelProperty(value = "优惠券列表")
	private List<RightsCouponResp> couponList;

	@ApiModelProperty(value = "商品列表")
	private List<RightsGoodsResp> goodsList;
}
