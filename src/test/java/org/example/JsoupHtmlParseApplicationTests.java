package org.example;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.val;
import org.example.domain.Book;
import org.example.mapper.BookMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//springboot的测试环境
@SpringBootTest(classes = JsoupDay3.class)
@RunWith(SpringRunner.class)
public class JsoupHtmlParseApplicationTests {
    @Autowired //依赖注入mapper层 ，使用新增方法即可
    private BookMapper bookMapper;
    @Test
    public void contextLoads() throws IOException {
        //1.准备一个url:
        String url="https://search.jd.com/Search?keyword=java";
        //2.解析URL获取文档对象
        Document document = Jsoup.parse(new URL(url), 3000);

        //3.通过jGoodsList获取所有商品信息
        Element jGoodsList = document.getElementById("J_goodsList");

        //4.每一个li标签对应的就是一个商品信息，从jGoodsList去获取所有的li标签
        Elements elements =  jGoodsList.getElementsByTag("li");

        //5.通过循环的方式将商品信息存入Book对象并保存到数据库
        int id=0;
        for ( Element el: elements) {
            Book book=new Book();
            id++;
            //京东的图片比较多，可以采用懒加载
            // String img = el.getElementsByTag("img").eq(0).attr("data-lazy-img");
            String price = el.getElementsByClass("p-price").eq(0).text();
            String name = el.getElementsByClass("p-name").eq(0).text();
            book.setId(id);
            book.setName(name);
            book.setPrice(price);
            //6.调用新增方法
            bookMapper.insert(book);

        }

        System.out.println("批量插入数据成功");
    }



}
