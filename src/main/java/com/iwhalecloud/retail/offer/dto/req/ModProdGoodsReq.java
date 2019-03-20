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
 * @CreateDate 2019/3/6 <br>
 * @see com.iwhalecloud.retail.offer.dto.req <br>
 * @since V9.0C<br>
 */
@Data
public class ModProdGoodsReq implements Serializable {

    private static final long serialVersionUID = 2590990853331778490L;

    private String name;

    private String sn;

    private String productCode;

    private String typeId;

    private String simpleName;

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
