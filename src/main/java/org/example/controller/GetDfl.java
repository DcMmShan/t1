package org.example.controller;

import com.baomidou.mybatisplus.core.assist.ISqlRunner;
import org.example.domain.Daifulong;
import org.example.domain.Sdata;
import org.example.mapper.DaifulongMapper;
import org.example.mapper.SdataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetDfl {
    @Autowired // 注入mapper层接口，可以用接口查数据
    private DaifulongMapper daifulongMapper;
    @ResponseBody    //返回值自动解析为json格式
    @RequestMapping("/getdfl")   //设置请求路径
    public List<Daifulong> getDfl(){


        List<Daifulong> dfl=daifulongMapper.selectList(null);
        return dfl;
    }
}
