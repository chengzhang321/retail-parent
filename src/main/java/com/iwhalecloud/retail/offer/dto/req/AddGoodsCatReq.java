package com.iwhalecloud.retail.offer.dto.req;

import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/27 <br>
 * @see com.iwhalecloud.retail.offer.dto.req <br>
 * @since V9.0C<br>
 */
@Data
public class AddGoodsCatReq {

    private String name;

    private String catType;

    private String comments;

    private String storeId;

    private String parentId;

    private String logo;

    private Long catOrder;
}
