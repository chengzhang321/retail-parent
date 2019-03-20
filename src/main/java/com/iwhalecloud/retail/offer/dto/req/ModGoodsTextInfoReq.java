package com.iwhalecloud.retail.offer.dto.req;

import java.io.Serializable;

import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/8 <br>
 * @see com.iwhalecloud.retail.offer.dto.req <br>
 * @since V9.0C<br>
 */
@Data
public class ModGoodsTextInfoReq implements Serializable {

    private static final long serialVersionUID = -9045019184872057936L;

    private String goodsId;

    private String intro;

    private String afterSale;
}
