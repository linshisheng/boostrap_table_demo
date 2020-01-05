package com.oppo.configuration;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/5 14:25
 */

@Configuration
public class PageHelperConfig {

    @Bean
    public PageHelper createPageHelper() {
        PageHelper pageHelper = new PageHelper();
        return  pageHelper;
    }

}
