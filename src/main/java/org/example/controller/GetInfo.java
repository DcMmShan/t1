package org.example.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.domain.Book;
import org.example.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetInfo {
    @Autowired  //注入mapper层接口，json把数据爬到数据库里边，现可以用接口查数据
    private BookMapper bookMapper;
    @ResponseBody  //返回值自动解析为json格式
    @RequestMapping("/getinfo")  //设置请求路径
    public List<Book> getBooks(){
        List<Book> books=bookMapper.selectList(null);
        return  books;
    }
}
