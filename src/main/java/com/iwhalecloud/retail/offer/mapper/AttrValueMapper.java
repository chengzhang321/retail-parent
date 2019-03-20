package com.iwhalecloud.retail.offer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iwhalecloud.retail.offer.entity.AttrValue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author fanxiaofei
 * @date 2019/03/04
 */
@Mapper
public interface AttrValueMapper extends BaseMapper<AttrValue> {

    /**
     * 根据属性id查询所有属性值
     * @param attrId String
     * @return List<AttrValue>
     */
    List<AttrValue> queryAttrValueByAttrId(String attrId);

    /**
     * 根据属性id删除所有属性值
     * @param attrId String
     * @return List<AttrValue>
     */
    void delAttrValueByAttrId(String attrId);

}
