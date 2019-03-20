package com.iwhalecloud.retail.offer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iwhalecloud.retail.offer.dto.req.QryProdGoodsCatReq;
import com.iwhalecloud.retail.offer.entity.ProdGoodsCat;

/**
 * <Description> <br>
 *
 * @author huang.anxin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/25 <br>
 * @see com.iwhalecloud.retail.offer.mapper <br>
 * @since V9.0C<br>
 */
@Mapper
public interface ProdGoodsCatMapper extends BaseMapper<ProdGoodsCat> {

    List<ProdGoodsCat> qryProdGoodsCatList(QryProdGoodsCatReq request);

    List<ProdGoodsCat> qryChildProdGoodsCatList(@Param("parentId") String parentId);

}
