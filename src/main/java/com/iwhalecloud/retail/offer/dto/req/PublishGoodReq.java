package com.iwhalecloud.retail.offer.dto.req;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 
 * <Description> <br> 
 *  
 * @author wang.zhongbao<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月6日 <br>
 * @since V9.0C<br>
 * @see com.iwhalecloud.retail.offer.dto.req <br>
 */
@Data
public class PublishGoodReq implements Serializable {

    /**
     * serialVersionUID <br>
     */
    private static final long serialVersionUID = 4817766843034747530L;
    
    private Date marketBeg;
    
    private Date marketEnd;

}
