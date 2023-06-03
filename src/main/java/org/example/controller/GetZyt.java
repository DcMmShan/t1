package org.example.controller;

import org.example.domain.Zhaoyans;
import org.example.domain.Zhaoyant;
import org.example.mapper.ZhanyantMapper;
import org.example.mapper.ZhaoyansMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetZyt {
    @Autowired
    private ZhanyantMapper zhanyantMapper;

    @ResponseBody
    @RequestMapping("getzyt")
    public List<Zhaoyant> getZyt(){
       List<Zhaoyant> zyt=zhanyantMapper.selectList(null);
       return zyt;
    }


}
