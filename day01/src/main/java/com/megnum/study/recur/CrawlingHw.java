package com.megnum.study.recur;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class CrawlingHw implements Runnable
{
    private final String connectURL;
    private final int indent;

    public CrawlingHw(String connectURL, int indent) {
        this.connectURL = connectURL;
        this.indent = indent;
    }

    public static void main(String[] args) throws IOException {
        CrawlingHw hw = new CrawlingHw("https://mail.naver.com", 0);
        hw.run();
    }

    public void printIndent() {


    }


    @Override
    public void run()
    {
        try {
            //네이버로 접속
            Document doc = Jsoup.connect( connectURL ).get(); //html가져오기
            //System.out.println(doc.toString()); 전체 html 출력

            //Elements els = doc.select(".nav_item a"); //class nav_item인 a 태그 전부 찾음
            //class nav_item인 a 태그의 get(9)를통해 9번째 요소 가져와
            //a 태그의 href 속성값 전부 print
            Elements elements = doc.select(".nav_item a");
            elements.stream().forEach(it -> {
//                System.out.println(it);

                String url = it.attributes().get("href");

                for (int i = 0; i < indent; i++) {
                    System.out.print(" ");
                }
                System.out.println(url);

                CrawlingHw crawlingHw2 = new CrawlingHw(url, 4);
                crawlingHw2.run();
            });

//            Element els = doc.select(".nav_item a").get(0);
//            String link1 = els.getElementsByAttribute("href").attr("href");
//            System.out.println("URL1: " + link1);
//
//            //nav_item인 a 태그의 href 9번째 링크를 타고 들어가
//            //Elements els = doc.select(".Nlist_item a"); //class .Nlist_item인 a 태그 전부 찾음
//            //class Nlist_item인 a 태그의 get(1)를 통해 1번째 요소 가져와
//            //a 태그의 href 속성값 전부 print
//            Document doc2 = Jsoup.connect(link1).get();
//            Element els2 = doc2.select(".Nlist_item a").get(1);
//            String link2 = els2.getElementsByAttribute("href").attr("href");
//            System.out.println("URL2: " +link2);
//
//            Document doc3 = Jsoup.connect(link2).get();
//            Element els3 = doc3.select(".cluster_text a").get(1);
//            String link3 = els3.getElementsByAttribute("href").attr("href");
//            System.out.println("URL3: " +link3);
//
//            Document doc4 = Jsoup.connect(link3).get();
//            Element els4 = doc4.select(".Nlnb_menu_inner a").get(2);
//            String link4 = els4.getElementsByAttribute("href").attr("href");
//            System.out.println("URL4: " +link4);
//
//            Document doc5 = Jsoup.connect(link4).get();
//            Element els5 = doc5.select(".cluster_text a").get(1);
//            String link5 = els5.getElementsByAttribute("href").attr("href");
//            System.out.println("URL5: " +link5);
//
//            Document doc6 = Jsoup.connect(link5).get();
//            Element els6 = doc6.select(".Nlnb_menu_inner a").get(3);
//            String link6 = els6.getElementsByAttribute("href").attr("href");
//            System.out.println("URL6: " +link6);
//
//            Document doc7 = Jsoup.connect(link6).get();
//            Element els7 = doc7.select(".cluster_text a").get(1);
//            String link7 = els7.getElementsByAttribute("href").attr("href");
//            System.out.println("URL7: " +link7);
//
//            Document doc8 = Jsoup.connect(link7).get();
//            Element els8 = doc8.select(".Nlnb_menu_inner a").get(4);
//            String link8 = els8.getElementsByAttribute("href").attr("href");
//            System.out.println("URL8: " +link8);
//
//            Document doc9 = Jsoup.connect(link8).get();
//            Element els9 = doc9.select(".cluster_text a").get(2);
//            String link9 = els9.getElementsByAttribute("href").attr("href");
//            System.out.println("URL9: " +link9);
//
//            Document doc10 = Jsoup.connect(link9).get();
//            Element els10 = doc10.select(".media_end_linked_item a").get(3);
//            String link10 = els10.getElementsByAttribute("href").attr("href");
//            System.out.println("URL10: " +link10);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}