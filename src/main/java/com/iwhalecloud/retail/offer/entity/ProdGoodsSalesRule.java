package com.iwhalecloud.retail.offer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品销售规则
 * @author fanxiaofei
 * @date 2019-03-01
 */
@Data
@TableName("prod_goods_sales_rule")
public class ProdGoodsSalesRule implements Serializable {

	private static final long serialVersionUID = 1L;


  	/**
  	 * 商品销售规则id
  	 */
	@TableId(type = IdType.INPUT)
	@ApiModelProperty(value = "商品销售规则id")
  	private Integer salesRuleId;
  	
  	/**
  	 * 规则名称
  	 */
	@ApiModelProperty(value = "规则名称")
  	private String name;
  	
  	/**
  	 * 说明
  	 */
	@ApiModelProperty(value = "说明")
  	private String comments;

}
