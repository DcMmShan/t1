package org.example.controller;

import org.example.domain.Zhoujin2;
import org.example.mapper.ZhoujinMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetZhoujin2 {
    @Autowired
    private ZhoujinMapper2 zhoujinMapper2;
    @ResponseBody
    @RequestMapping("getzj2")
    public List<Zhoujin2> getZj(){
        List<Zhoujin2> zj=zhoujinMapper2.selectList(null);
        return zj;
    }
}
