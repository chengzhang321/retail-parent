package com.iwhalecloud.retail.offer.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * <Description> <br>
 *
 * @author liuhongyu4 <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2019/3/12 <br>
 * @see com.iwhalecloud.retail.offer.entity <br>
 * @since CRM <br>
 */
@Data
@TableName("car_series")
public class CarSeries implements Serializable {

    private String carSeriesId;

    private String carSeriesName;

    private String price;

    private String inoutSale;

    private String carSpecId;

    private String carBrandId;
}
