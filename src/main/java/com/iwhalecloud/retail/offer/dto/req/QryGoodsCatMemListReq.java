package com.iwhalecloud.retail.offer.dto.req;

import com.iwhalecloud.retail.common.dto.PageVO;
import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/1 <br>
 * @see com.iwhalecloud.retail.offer.dto.req <br>
 * @since V9.0C<br>
 */
@Data
public class QryGoodsCatMemListReq extends PageVO {

    private String catId;

    private String qt;

    private String catType;
}
