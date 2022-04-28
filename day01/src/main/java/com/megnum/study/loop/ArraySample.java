package com.megnum.study.loop;

import org.apache.commons.lang3.time.StopWatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArraySample
{
    StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws FileNotFoundException {

//        Student[] stdList = new Student[100];
//
//        Student student = new Student();
//        Student student2 = new Student();
//
//        List<String> list = new ArrayList<String>();
//        list.add("ee");
//
//        String a = (String) list.get(1);
//
//        if (student == student2 ) {
//            System.out.println("두 학생은 같다.");
//        }
//
//        String aStr = "BBBBBB";
//        String bStr = "BBBBBB";
//
//        if (aStr == bStr ) {
//            System.out.println("두 값은 같다.");
//        }
//
//
//
//        int aaa = 1000;
//        int bbb = 1000;
//
//        if (aaa == bbb ) {
//            System.out.println("두 값은 같다.");
//        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        String a = "A";
        for (int i = 0; i < 20; i++) {
            a = a + a;
        }
//        System.out.println(a);

        stopWatch.stop();
        System.out.println(stopWatch.getTime());

        stopWatch.reset();
        stopWatch.start();
        StringBuilder sb = new StringBuilder("A");
        for (int i = 0; i < 20; i++) {
            sb.append(sb);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getTime());
//        System.out.println(sb.toString());


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("런이 호출됐어요!!!!!");
            }
        };
        System.out.println(runnable.getClass().getName());

        runnable.run();

        ExtendRunable extendRunable = new ExtendRunable();
        extendRunable.run();
        System.out.println(extendRunable.getClass().getName());

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("런이 호출됐어요!!!!!");
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("222런이 호출됐어요!!!!!");
//            }
//        }).start();

//        new Thread(() -> {
//            System.out.println("람다로 런이 호출됐어요!!!!!");
//        }
//        ).start();
//
//        new Thread( () -> {
//            System.out.println("람다로 런이2222 호출됐어요!!!!!");
//        }
//        ).start();

        for (int i=1 ; i<100 ; i++) {
            if (i<20){
                if (i<10) {
                    System.out.println(i + " 번");
                }
            }
        }

        IntStream.range(1, 100)
                .parallel()
                .filter( it -> it < 20)
                .filter(it -> it < 10)
                .mapToObj(it -> {
                    return it + " 번";
                }
                ).forEach(System.out::println);


        FileInputStream fileInputStream = new FileInputStream(new File("./test.file"));



    }// main end


}
