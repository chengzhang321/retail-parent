package com.iwhalecloud.retail.offer.dto.resp;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 接触渠道(域)
 * @author fanxiaofei
 * @date 2019-03-04
 */
@Data
public class ContactChannelResp implements Serializable {

	private static final long serialVersionUID = 1L;


  	/**
  	 * 商品类型id
  	 */
	@ApiModelProperty(value = "id")
  	private String contactChannelId;
  	
  	/**
  	 * 类型
  	 */
	@ApiModelProperty(value = "类型 1 H5商城 2 中移集团掌厅 3 江苏移动掌厅")
  	private String channelType;

	/**
	 * 名称
	 */
	@ApiModelProperty(value = "名称")
	private String contactChannelName;
  	
  	/**
  	 * 描述
  	 */
	@ApiModelProperty(value = "描述")
  	private String comments;

}
