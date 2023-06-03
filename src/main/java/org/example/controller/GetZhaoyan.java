package org.example.controller;

import org.example.domain.Zhaoyan;
import org.example.mapper.ZhaoyanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetZhaoyan {
    @Autowired
    private ZhaoyanMapper zhaoyanMapper;
    @ResponseBody
    @RequestMapping("getzy")
    public List<Zhaoyan> getZy(){
        List<Zhaoyan> zy= zhaoyanMapper.selectList(null);
        return zy;
    }


}
