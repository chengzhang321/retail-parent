package com.iwhalecloud.retail.offer.dto.resp;

import java.io.Serializable;

import lombok.Data;

/**
 * <Description> <br>
 *
 * @author liuhongyu4 <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2019/3/12 <br>
 * @see com.iwhalecloud.retail.offer.dto.resp <br>
 * @since CRM <br>
 */
@Data
public class CarSeriesResp implements Serializable {

    private String carSeriesId;

    private String carSeriesName;

    private String price;

    private String inoutSale;

    private String carSpecId;

    private String carBrandId;
}
