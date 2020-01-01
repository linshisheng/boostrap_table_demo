package com.oppo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/1 15:47
 */
@RestController
@RequestMapping("/demo")
public class Demo01Controller {

    @RequestMapping("bingo")
    private String bingo(){
        return "hello word !";
    }

}
