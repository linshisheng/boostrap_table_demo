package com.oppo.controller;

import com.oppo.pojo.common.PageEntity;
import com.oppo.pojo.common.PageResposeEntity;
import com.oppo.pojo.common.Result;
import com.oppo.pojo.filter.AdsSearchKwOperateFilter;
import com.oppo.pojo.vo.AdsSearchKwOperateVO;
import com.oppo.service.AdsSearchKwOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/5 15:30
 */

@RestController
@RequestMapping("/adsSearchKwOperate")
public class AdsSearchKwOperateController {

    @Autowired
    private AdsSearchKwOperateService adsSearchKwOperateService;

    @RequestMapping("/list")
    public     PageResposeEntity<AdsSearchKwOperateVO>  findAll(){
        AdsSearchKwOperateFilter adsSearchKwOperateFilter = new AdsSearchKwOperateFilter();
        PageEntity pageEntity = new PageEntity();
        adsSearchKwOperateFilter.setAppId(5391);
        pageEntity.setPage(1);
        pageEntity.setRows(10);
        Result<PageResposeEntity<AdsSearchKwOperateVO>> result = adsSearchKwOperateService.findAll(adsSearchKwOperateFilter, pageEntity);
        PageResposeEntity<AdsSearchKwOperateVO> pageResposeEntity = (PageResposeEntity<AdsSearchKwOperateVO>) result.getData();
        return pageResposeEntity;
    }
}
