package com.iwhalecloud.retail.offer.dto.req;

import com.iwhalecloud.retail.offer.consts.BaseDtoCodeDef;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 自动库存上下架
 * @author fanxiaofei
 * @date 2019-03-04
 */
@Data
public class ProdGoodsStockWaveReq implements Serializable {

	private static final long serialVersionUID = 1L;


  	/**
  	 * 商品id
  	 */
	@NotNull(message = BaseDtoCodeDef.GOODS_ID_IS_NULL)
	@ApiModelProperty(value = "商品id")
  	private String goodsId;

  	/**
  	 * 上架时间
  	 */
	@NotNull(message = BaseDtoCodeDef.STOCK_IN_DATE_IS_NULL)
	@DateTimeFormat(pattern = BaseDtoCodeDef.DATA_TYPE)
	@ApiModelProperty(value = "上架时间")
  	private Date stockInDate;

	/**
	 * 上架数量
	 */
	@NotNull(message = BaseDtoCodeDef.STOCK_IN_NUM_IS_NULL)
	@ApiModelProperty(value = "上架数量")
	private String qty;

	/**
	 * 上架方式 C:覆盖 P:追加
	 */
	@NotNull(message = BaseDtoCodeDef.STOCK_IN_TYPE_IS_NULL)
	@ApiModelProperty(value = "上架方式 C:覆盖 P:追加")
	private String stockInType;

	/**
	 * 说明
	 */
	@ApiModelProperty(value = "说明")
	private String comments;

}
