package com.iwhalecloud.retail.offer.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author fanxiaofei
 * @date 2019-03-14
 */
@Data
public class RightsGoodsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "商品ID")
	private String offerId;

	@ApiModelProperty(value = "商品名称")
	private String offerName;

	@ApiModelProperty(value = "周期 1-年、2-月、3-周、4-季度")
	private String getCycle;

	@ApiModelProperty(value = "总数")
	private String sumCount;

	@ApiModelProperty(value = "剩余领取次数")
	private String remainCount;

}
