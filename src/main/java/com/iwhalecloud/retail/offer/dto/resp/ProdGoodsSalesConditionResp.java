package com.iwhalecloud.retail.offer.dto.resp;

import java.io.Serializable;

import com.iwhalecloud.retail.offer.entity.ProdGoodsSalesCondition;
import lombok.Data;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/5 <br>
 * @see com.iwhalecloud.retail.offer.dto.resp <br>
 * @since V9.0C<br>
 */
@Data
public class ProdGoodsSalesConditionResp extends ProdGoodsSalesCondition implements Serializable {

    private static final long serialVersionUID = 7533100300791752359L;

    private String name;

    private String comments;
}
