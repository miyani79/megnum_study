package com.megnum.study.loop;

import java.util.ArrayList;
import java.util.List;

public class ArraySample
{
    public static void main(String[] args) {
        
        Student[] stdList = new Student[100];

        Student student = new Student();
        Student student2 = new Student();

        List<String> list = new ArrayList<String>();
        list.add("ee");

        String a = (String) list.get(1);

        if (student == student2 ) {
            System.out.println("두 학생은 같다.");
        }

        String aStr = "BBBBBB";
        String bStr = "BBBBBB";

        if (aStr == bStr ) {
            System.out.println("두 값은 같다.");
        }



        int aaa = 1000;
        int bbb = 1000;

        if (aaa == bbb ) {
            System.out.println("두 값은 같다.");
        }




    }
}
