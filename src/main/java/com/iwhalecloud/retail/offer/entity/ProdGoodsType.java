package com.iwhalecloud.retail.offer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品类型(域)
 * @author fanxiaofei
 * @date 2019-03-01
 */
@Data
@TableName("prod_goods_type")
public class ProdGoodsType implements Serializable {

	private static final long serialVersionUID = 1L;


  	/**
  	 * 商品类型id
  	 */
	@TableId(type = IdType.INPUT)
	@ApiModelProperty(value = "商品类型id")
  	private String typeId;
  	
  	/**
  	 * 名称
  	 */
	@ApiModelProperty(value = "名称")
  	private String typeName;
  	
  	/**
  	 * 描述
  	 */
	@ApiModelProperty(value = "描述")
  	private String comments;

}
