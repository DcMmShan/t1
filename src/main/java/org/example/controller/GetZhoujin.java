package org.example.controller;

import org.example.domain.Zhoujin;
import org.example.domain.Zhoujin2;
import org.example.mapper.ZhoujinMapper;
import org.example.mapper.ZhoujinMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetZhoujin {
    @Autowired
    private ZhoujinMapper zhoujinMapper;
    @ResponseBody
    @RequestMapping("getzj")
    public List<Zhoujin> getZj(){
        List<Zhoujin> zj=zhoujinMapper.selectList(null);
        return zj;
    }
}
