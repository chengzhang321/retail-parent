package com.iwhalecloud.retail.offer.dto.req;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/5 <br>
 * @see com.iwhalecloud.retail.offer.dto.req <br>
 * @since V9.0C<br>
 */
@Data
public class AddProdGoodsReq implements Serializable {

    private static final long serialVersionUID = -7757559536272177235L;

    private String name;

    private String sn;

    private String productCode;

    private String typeId;

    private String simpleName;

    private String catId;

    private String saleCatId;

    private String duplicateFlag;

    private Long maxBuyCount;

    private Long price;

    private Long mktprice;

    private Long stockQty;

    private List<String> tagIdList;

    private Date marketingBeginTime;

    private Date marketingEndTime;

}
