package com.oppo.mapper;

import com.oppo.pojo.Schedule;
import com.oppo.pojo.bo.ScheduleBO;
import com.oppo.pojo.filter.ScheduleFilter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/1 15:36
 */

@Mapper
public interface ScheduleMapper {
    /**
     * 排期条件查询
     * @param scheduleFilter
     * @return
     */
    List<ScheduleBO> findAll(ScheduleFilter scheduleFilter);
}
