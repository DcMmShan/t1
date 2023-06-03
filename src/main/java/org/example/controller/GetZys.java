package org.example.controller;

import org.example.domain.Zhaoyans;
import org.example.mapper.ZhaoyansMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetZys {
    @Autowired
    private ZhaoyansMapper zhaoyansMapper;
    @ResponseBody
    @RequestMapping("getzyts")
    public List<Zhaoyans> getZys(){
        List<Zhaoyans> zys=zhaoyansMapper.selectList(null);
        return zys;
    }
}
