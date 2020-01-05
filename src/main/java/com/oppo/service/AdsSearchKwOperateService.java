package com.oppo.service;

import com.oppo.pojo.common.PageEntity;
import com.oppo.pojo.common.PageResposeEntity;
import com.oppo.pojo.common.Result;
import com.oppo.pojo.filter.AdsSearchKwOperateFilter;
import com.oppo.pojo.vo.AdsSearchKwOperateVO;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/5 15:15
 */

public interface AdsSearchKwOperateService {


    Result<PageResposeEntity<AdsSearchKwOperateVO>> findAll(AdsSearchKwOperateFilter adsSearchKwOperateFilter, PageEntity pageEntity);

}
