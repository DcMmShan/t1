package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    @ResponseBody //该方法返回值变为json格式
    @RequestMapping("/hello2")  //项目访问的路径 localhost:8080/名字
    public  String hello(){
        return  "sb";
    }
}
