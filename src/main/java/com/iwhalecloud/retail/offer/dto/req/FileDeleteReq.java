package com.iwhalecloud.retail.offer.dto.req;

import java.io.Serializable;

import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/7 <br>
 * @see com.iwhalecloud.retail.offer.dto.req <br>
 * @since V9.0C<br>
 */
@Data
public class FileDeleteReq implements Serializable {

    private static final long serialVersionUID = -4507577842396204230L;

    private String type;

    private String key;

    private String url;
}
