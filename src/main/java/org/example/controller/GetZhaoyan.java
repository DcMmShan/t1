package org.example.controller;

import org.example.domain.Sdata;
import org.example.domain.Zhaoyan;
import org.example.mapper.ZhaoyanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetZhaoyan {
    @Autowired
    private ZhaoyanMapper zhaoyanMapper;

    @RequestMapping("/getData")
    public List<Zhaoyan> getData() {
        List<Zhaoyan> zhaoyans = zhaoyanMapper.selectList(null);
        return zhaoyans;
    }

    @RequestMapping("/getById")
    public Zhaoyan getById(Integer id) {
        Zhaoyan zhaoyan = zhaoyanMapper.selectById(id);
        return zhaoyan;
    }

    @RequestMapping("/insertData")
    public Zhaoyan insertData(@RequestBody Zhaoyan zhaoyan){
        zhaoyanMapper.insert(zhaoyan);
        System.out.println("新增成功，新增的数据是"+zhaoyan);
        return zhaoyan;
    }
    @RequestMapping("/updateData")
    public String updateData(@RequestBody Zhaoyan zhaoyan){
        zhaoyanMapper.updateById(zhaoyan);
        System.out.println(zhaoyan);
        return "修改成功";
    }

    @RequestMapping("/deleteById")
    public void deleteById(@RequestBody Integer id){
        zhaoyanMapper.deleteById(id);
        System.out.println("删除成功");
    }
}
