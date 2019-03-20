package com.iwhalecloud.retail.offer.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品包成员
 * @author fanxiaofei
 * @date 2019-03-01
 */
@Data
@TableName("prod_goods_group_rel")
public class ProdGoodsGroupRel implements Serializable {

	private static final long serialVersionUID = 1L;


  	/**
  	 * 商品包id
  	 */
	@ApiModelProperty(value = "商品关系id")
  	private String packageGoodsId;
  	
  	/**
  	 * 商品id
  	 */
	@ApiModelProperty(value = "A端商品id")
  	private String goodsId;

}
