package com.iwhalecloud.retail.offer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iwhalecloud.retail.offer.dto.resp.ContactChannelResp;
import com.iwhalecloud.retail.offer.entity.ContactChannel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author fanxiaofei
 * @date 2019/03/04
 */
@Mapper
public interface ContactChannelMapper extends BaseMapper<ContactChannel> {

    /**
     * 查询渠道
     * @return List<ContactChannel>
     */
    List<ContactChannelResp> listContactChannel();


}
