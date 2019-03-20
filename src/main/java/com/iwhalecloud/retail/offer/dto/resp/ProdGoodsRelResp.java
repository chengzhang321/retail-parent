package com.iwhalecloud.retail.offer.dto.resp;

import java.io.Serializable;

import com.iwhalecloud.retail.offer.entity.ProdGoods;
import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/5 <br>
 * @see com.iwhalecloud.retail.offer.dto.resp <br>
 * @since V9.0C<br>
 */
@Data
public class ProdGoodsRelResp extends ProdGoods implements Serializable {

    private static final long serialVersionUID = -4058802365743882479L;

    private String relId;

    private String aGoodsId;

    private String relType;

    private String relTypeName;

    private String zGoodsId;

}
