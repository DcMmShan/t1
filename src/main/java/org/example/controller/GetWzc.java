package org.example.controller;

import org.example.domain.Wangzhicheng;
import org.example.mapper.WangzhichengMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetWzc {
    @Autowired
    private WangzhichengMapper wangzhichengMapper;
    @RequestMapping("getwzc")
    @ResponseBody
    public List<Wangzhicheng> getWzc(){
        List<Wangzhicheng> wzc=wangzhichengMapper.selectList(null);
        return wzc;
    }
}
