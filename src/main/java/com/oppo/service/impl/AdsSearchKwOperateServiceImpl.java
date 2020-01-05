package com.oppo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.oppo.mapper.AdsSearchKwOperateMapper;
import com.oppo.pojo.common.CodeMsg;
import com.oppo.pojo.common.PageEntity;
import com.oppo.pojo.common.PageResposeEntity;
import com.oppo.pojo.common.Result;
import com.oppo.pojo.filter.AdsSearchKwOperateFilter;
import com.oppo.pojo.vo.AdsSearchKwOperateVO;
import com.oppo.service.AdsSearchKwOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/5 15:15
 */
@Service
public class AdsSearchKwOperateServiceImpl implements AdsSearchKwOperateService {

    @Autowired
    private AdsSearchKwOperateMapper adsSearchKwOperateMapper;
    @Override
    public  Result<PageResposeEntity<AdsSearchKwOperateVO>>  findAll(AdsSearchKwOperateFilter adsSearchKwOperateFilter, PageEntity pageEntity) {


      Result<PageResposeEntity<AdsSearchKwOperateVO>> result= new Result<PageResposeEntity<AdsSearchKwOperateVO>>();
       Page page = PageHelper.startPage(pageEntity.getPage(), pageEntity.getRows());
        PageResposeEntity<AdsSearchKwOperateVO> pageResposeEntity = new PageResposeEntity<>();
        List<AdsSearchKwOperateVO> voList = adsSearchKwOperateMapper.findAll(adsSearchKwOperateFilter);
        if (voList != null){
            long totalCount = page.getTotal();
            pageResposeEntity.setResultList(voList);
            pageResposeEntity.setTotalCount(totalCount);
            result.setCode(0);
            result.setData(pageResposeEntity);
            result.setMsg(CodeMsg.SUCCESS_MSG);
        }else{
            Result.error(CodeMsg.SERVER_ERROR);
        }




        return result;
    }
}
