package com.springboot.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2017/6/14.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }
}
