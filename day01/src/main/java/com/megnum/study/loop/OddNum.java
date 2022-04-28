package com.megnum.study.loop;

import java.util.Scanner;

public class OddNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[][] array = new int[n][n];

        int rowStart = 0;
        int colStart = n/2;
        int curNum=1;
        int maxNum = n * n;

        while (curNum < maxNum)
        {
            System.out.println(curNum);

            try {
                array[rowStart][colStart] = curNum++;
            }
            catch (Exception e) {
                System.out.println("row=" + rowStart);
                System.out.println("col=" + colStart);
                throw e;
            }

            //대각선이동 후 값채우기 2
            rowStart = rowStart - 1;
            colStart = colStart + 1;

            if (rowStart < 0) {
                rowStart = array.length -1;
            }

            if (colStart >= array.length) {
                colStart = 0;
            }

            //값이 이미 존재한다면
            if (array[rowStart][colStart] != 0) {
                rowStart = rowStart + 1;
                colStart = colStart - 1;
                rowStart = rowStart + 1;
            }
            else if (array[rowStart][colStart] == 0) {
                array[rowStart][colStart] = curNum;
            }
            else if (array[rowStart][colStart] == 0) {
                array[rowStart][colStart] = curNum;
            }
            else if (array[rowStart][colStart] != 0) {
                colStart = array.length - 1;
            }
            else if (colStart >= array.length) {
                colStart = 0;
            }
            else if (rowStart < 0) {
                rowStart = array.length -1;
            }


        }
//        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 3
//        rowStart = rowStart - 1;
//        colStart = colStart + 1;



//        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 4
//        rowStart = rowStart - 1;
//        colStart = colStart + 1;



//        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 5
//        rowStart = rowStart - 1;
//        colStart = colStart + 1;




        //대각선이동 후 값채우기 6
//        rowStart = rowStart - 1;
//        colStart = colStart + 1;



        //대각선이동 후 값채우기 7
//        rowStart = rowStart + 1;
//        colStart = colStart - 1;



//        array[rowStart][colStart] = curNum++;
//
//        //대각선이동 후 값채우기 8
//        rowStart = rowStart - 1;
//        colStart = colStart + 1;



//        array[rowStart][colStart] = curNum++;

        //대각선이동 후 값채우기 9
//        rowStart = rowStart - 1;
//        colStart = colStart + 1;



//        array[rowStart][colStart] = curNum++;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print( array[i][j] + " ");
            }
            System.out.println();
        }
    }
}



//        System.out.println("hello world");
//        System.out.println("***************************");
//
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = 0;
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("***************************");
