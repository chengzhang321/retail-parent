package com.iwhalecloud.retail.offer.dto.resp;

import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/28 <br>
 * @see com.iwhalecloud.retail.offer.dto.resp <br>
 * @since V9.0C<br>
 */
@Data
public class QryGoodsCatListResp {


    /**
     * 目录标识
     */
    private String catId;

    /**
     * 目录名称
     */
    private String name;

    /**
     * 类型
     */
    private String catType;

    /**
     * 描述
     */
    private String comments;

    /**
     * 店铺
     */
    private String storeId;

    /**
     * 上级目录标识
     */
    private String parentId;

    /**
     * LOGO
     */
    private String logo;

    /**
     * 排序
     */
    private Long catOrder;

    /**
     * TANANT_ID
     */
    private Long tanantId;

    /**
     * children
     */
    private List<QryGoodsCatListResp> children;

}
