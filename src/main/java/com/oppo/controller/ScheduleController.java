package com.oppo.controller;

import com.oppo.pojo.Schedule;
import com.oppo.pojo.bo.ScheduleBO;
import com.oppo.pojo.filter.ScheduleFilter;
import com.oppo.service.impl.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/1 16:30
 */

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleServiceImpl scheduleServiceImpl;
    @RequestMapping("/list")
    public ModelAndView list(ScheduleFilter scheduleFilter){
        Map<String,Object> map = new HashMap<>(2);
        List<ScheduleBO> scheduleBOList = scheduleServiceImpl.findAll(scheduleFilter);
        map.put("scheduleBOList",scheduleBOList);
        return new ModelAndView("boostrap_table_demo.html",map);
    }
}
