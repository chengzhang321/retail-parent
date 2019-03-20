package com.iwhalecloud.retail.offer.dto.resp;

import java.io.Serializable;

import com.iwhalecloud.retail.offer.entity.ProdGoodsCat;
import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/6 <br>
 * @see com.iwhalecloud.retail.offer.dto.resp <br>
 * @since V9.0C<br>
 */
@Data
public class ProdGoodsCatMemResp extends ProdGoodsCat implements Serializable {

    private static final long serialVersionUID = 232632789446205924L;

    private String catMemId;

    private String goodsId;
}
