package com.iwhalecloud.retail.offer.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/14 <br>
 * @see com.iwhalecloud.retail.offer.entity <br>
 * @since V9.0C<br>
 */
@Data
@TableName("system_param")
public class SystemParam implements Serializable {

    private static final long serialVersionUID = 4011785935899670099L;

    private Long param;

    private String paramName;

    private String mask;

    private String currentValue;

    private String comments;
}
