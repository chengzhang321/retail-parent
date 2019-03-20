package com.iwhalecloud.retail.offer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iwhalecloud.retail.offer.entity.Attr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author fanxiaofei
 * @date 2019/03/04
 */
@Mapper
public interface AttrMapper extends BaseMapper<Attr> {

    /**
     * 查询所有属性
     * @return List<Attr>
     */
    List<Attr> queryAttrList();

    /**
     * 根据商品id过滤当前商品已有属性的其他所有属性
     * @param goodsId 商品id
     * @return List<Attr>
     */
    List<Attr> queryOutAttrListByGoodsId(String goodsId);

}
