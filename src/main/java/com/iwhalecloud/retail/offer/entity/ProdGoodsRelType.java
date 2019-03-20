package com.iwhalecloud.retail.offer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品关系类型(域)
 * @author fanxiaofei
 * @date 2019/02/26
 */
@Data
@TableName("prod_goods_rel_type")
public class ProdGoodsRelType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(type = IdType.INPUT)
    private String relType ;

    /**
     * 名称
     */
    private String relTypeName;

    /**
     * 描述
     */
    private String comments;

}

