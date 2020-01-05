package com.oppo.mapper;


import com.oppo.pojo.filter.AdsSearchKwOperateFilter;
import com.oppo.pojo.vo.AdsSearchKwOperateVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdsSearchKwOperateMapper {

    List<AdsSearchKwOperateVO> findAll(AdsSearchKwOperateFilter adsSearchKwOperateFilter);
}
