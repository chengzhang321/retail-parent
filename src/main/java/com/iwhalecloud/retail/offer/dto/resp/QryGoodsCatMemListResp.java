package com.iwhalecloud.retail.offer.dto.resp;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/1 <br>
 * @see com.iwhalecloud.retail.offer.dto.resp <br>
 * @since V9.0C<br>
 */
@Data
public class QryGoodsCatMemListResp implements Serializable {

    private static final long serialVersionUID = -4572295672451839298L;

    private String catMemId;

    private String catId;

    private String goodsId;

    private String name;

    private String sn;

    private String typeId;

    private String typeName;

    private String state;

    private String saleCatId;

    private String saleCatName;

    private Long stockQty;

    private Long price;

    private Date marketingBeginTime;

    private Date marketingEndTime;
}
