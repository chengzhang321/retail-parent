package com.iwhalecloud.retail.offer.dto.resp;

import java.io.Serializable;

import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/7 <br>
 * @see com.iwhalecloud.retail.offer.dto.resp <br>
 * @since V9.0C<br>
 */
@Data
public class FileUploadResp implements Serializable {

    private static final long serialVersionUID = 6669335519622449922L;

    private String url;
}
