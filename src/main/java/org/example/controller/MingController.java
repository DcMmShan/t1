package org.example.controller;

import org.example.domain.Ming;

import org.example.mapper.MingMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class MingController {
    @Autowired
    private MingMapper mingMapper;

    @RequestMapping("/getData")
    public List<Ming> getData() {
        List<Ming> mings = mingMapper.selectList(null);
        return mings;
    }

    @RequestMapping("/getById")
    public Ming getById(Integer id) {
       Ming ming = mingMapper.selectById(id);
        return ming;
    }

    @RequestMapping("/insertData")
    public Ming insertData(@RequestBody Ming ming){
        mingMapper.insert(ming);
        System.out.println("新增成功，新增的数据是"+ming);
        return ming;
    }
    @RequestMapping("/updateData")
    public String updateData(@RequestBody Ming ming){
        mingMapper.updateById(ming);
        System.out.println(ming);
        return "修改成功";
    }

    @RequestMapping("/deleteById")
    public void deleteById(@RequestBody Integer id){
        mingMapper.deleteById(id);
        System.out.println("删除成功");
    }
}
