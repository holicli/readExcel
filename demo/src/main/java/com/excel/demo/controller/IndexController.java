package com.excel.demo.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {


    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }


    @ResponseBody
    @RequestMapping("setvalue")
    public int setvalue(String value){
//        return indexService.setvalue();
        List<Map<String,Object>> list = (List<Map<String,Object>>)JSON.parse(value);
        return 123;
    }
}
