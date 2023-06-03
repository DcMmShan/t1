package org.example;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupTest    {
//通过标签来获取内容
@Test
public void testurl() throws IOException {
    //解析url地址，第一个参数url地址，第二个参数响应时间（访问超时时间）

    Document dom =  Jsoup.parse(new URL("https://www.jd.com/?cu=true&utm_source=baidu-pinzhuan&utm_medium=cpc&utm_campaign=t_288551095_baidupinzhuan&utm_term=0f3d30c8dba7459bb52f2eb5eba8ac7d_0_d7ece4a6d59b42e5add7a65e85646aae"),5000);
    //使用标签选择器获取title内容
    String title=dom.getElementsByTag("title").first().text();
    System.out.println("获取的文档标题："+title);
        }

     //读取文件内容
 @Test
public void testFile() throws IOException {
    //参数一是文件绝对位置
String content= FileUtils.readFileToString(new File("D:\\ruanjian\\ideawork\\untitled5\\src\\test\\java\\org\\example\\day2.html"),"UTF-8");
//解析字符串
     Document dom=Jsoup.parse(content);
     //使用标签选择器获取title内容
String title=dom.getElementsByTag("body").first().text();
     System.out.println(title);
 }


//使用DOM方式来遍历文档获取元素
@Test
public  void testForDom() throws IOException {
//解析文件、url
Document dom=Jsoup.parse(new File("D:\\ruanjian\\ideawork\\untitled5\\src\\test\\java\\org\\example\\day2.html"),"UTF-8");
//1.根据id查询元素getElementById（）
    Element h2= dom.getElementById("h2id");
//2.根据标签获取元素getElementByTag（）
 Elements div=dom.getElementsByTag("div");
//3.根据class获取元素getElementByClass（）
    System.out.println( dom.getElementsByClass("divid"));

//4.根据属性值获取元素
    System.out.println(  dom.getElementsByAttribute("zzz"));

    System.out.println(h2);
    System.out.println(div);

}

//根据选择器来获取元素
    @Test
    public void  testSele() throws IOException {
    //解析文件,获取文档对象
        Document dom=Jsoup.parse(new File("D:\\ruanjian\\ideawork\\untitled5\\src\\test\\java\\org\\example\\day2.html"),"UTF-8");
//
  Elements elements= dom.select("span");
  for(  Element element:elements  ){
      System.out.println(element.text());

  }
        //可以用id查找
        Element element= dom.select("#s1").first();
        System.out.println(element.text());
    }




}
