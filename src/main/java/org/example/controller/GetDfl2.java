package org.example.controller;


import org.example.domain.Daifulong2;
import org.example.mapper.DaifulongMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetDfl2 {
    @Autowired
    private DaifulongMapper2 daifulongMapper2;
    @ResponseBody
    @RequestMapping("getdfl2")
    public List<Daifulong2> getDfl(){
        List<Daifulong2> dfl=daifulongMapper2.selectList(null);
        return dfl;
    }
}
