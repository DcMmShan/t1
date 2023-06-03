package org.example.controller;

import org.example.domain.Hefeihong;
import org.example.mapper.HefeihongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetHfl {
    @Autowired  //注入接口
    private HefeihongMapper hefeihongMapper;
    @ResponseBody //返回值解析jion
    @RequestMapping("gethfh")  //请求路径
    public List<Hefeihong> getHfl(){
      List<Hefeihong> hfl  =hefeihongMapper.selectList(null);
        return hfl;
    }

}
