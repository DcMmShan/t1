package org.example.controller;

import org.example.domain.Daifulong;
import org.example.domain.Sdata;
import org.example.mapper.SdataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetSdata {
    @Autowired // 注入mapper层接口，可以用接口查数据
    private SdataMapper sdataMapper;
    @ResponseBody    //返回值自动解析为json格式
    @RequestMapping("/getsdata")   //设置请求路径
    public List<Sdata> getSdatas(){
        List<Sdata> sdata=sdataMapper.selectList(null);
        return sdata;
    }

}
