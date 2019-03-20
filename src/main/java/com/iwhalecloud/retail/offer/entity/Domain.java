package com.iwhalecloud.retail.offer.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 
 * <Description> <br> 
 *  
 * @author wang.zhongbao<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月4日 <br>
 * @since V9.0C<br>
 * @see com.iwhalecloud.retail.offer.entity <br>
 */
@Data
@TableName("domain")
public class Domain implements Serializable {
    
    /**
     * serialVersionUID <br>
     */
    private static final long serialVersionUID = -556741045206989140L;

    /**
     * tableName
     */
    String tableName; 
    
    /**
     * columnName
     */
    String columnName; 
    
    /**
     * lookupName
     */
    String value; 
    
    /**
     * lookupName
     */
    String lookupName; 
    
    /**
     * comments
     */
    String comments;



}
