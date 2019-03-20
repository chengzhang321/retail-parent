package com.iwhalecloud.retail.offer.entity;

import java.util.Date;

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
@TableName("t_tag")
public class Tag {

    private String tagId;

    private String tagName;

    private String tagDesc;

    private Integer tagType;

    private String tagColor;

    private Date updDate;


}
