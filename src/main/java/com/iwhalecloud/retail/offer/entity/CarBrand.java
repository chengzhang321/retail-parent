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
@TableName("car_brand")
public class CarBrand implements Serializable {

    private String carBrandId;

    private String carBrandName;

    private String idx;

    private String img;
}
