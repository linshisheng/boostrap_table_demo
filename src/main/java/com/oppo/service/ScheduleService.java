package com.oppo.service;

import com.oppo.pojo.bo.ScheduleBO;
import com.oppo.pojo.filter.ScheduleFilter;

import java.util.List;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/1 16:16
 */
public interface ScheduleService {
    /**
     * 条件查询
     * @param scheduleFilter
     * @return
     */
    List<ScheduleBO> findAll(ScheduleFilter scheduleFilter);
}
