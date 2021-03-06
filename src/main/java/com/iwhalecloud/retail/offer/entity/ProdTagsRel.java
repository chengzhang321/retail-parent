package com.iwhalecloud.retail.offer.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品标签
 * @author fanxiaofei
 * @date 2019-03-01
 */
@Data
@TableName("prod_tags_rel")
public class ProdTagsRel implements Serializable {

	private static final long serialVersionUID = 1L;


  	/**
  	 * 商品id
  	 */
	@ApiModelProperty(value = "商品id")
  	private String goodsId;
  	
  	/**
  	 * 标签id
  	 */
	@ApiModelProperty(value = "标签id")
  	private String tagId;


}
