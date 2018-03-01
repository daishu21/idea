package com.zking.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class JsoupTest {

    @Test
    public void test(){
        try {
            //获得doc文档
            Document document = Jsoup.connect("https://www.baidu.com/").get();

            System.out.println(document.title());

            Elements img = document.select("img");
            for (Element e : img) {
                System.out.println(e.attr("src"));
            }

            Elements a = document.select("a");
            for (Element e : a) {
                System.out.println(e.text());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
