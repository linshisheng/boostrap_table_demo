package com.oppo.service.impl;

import com.oppo.mapper.ScheduleMapper;
import com.oppo.pojo.bo.ScheduleBO;
import com.oppo.pojo.filter.ScheduleFilter;
import com.oppo.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/1 16:18
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public List<ScheduleBO> findAll(ScheduleFilter scheduleFilter) {

        List<ScheduleBO> scheduleBOList = scheduleMapper.findAll(scheduleFilter);

        return scheduleBOList;
    }
}
