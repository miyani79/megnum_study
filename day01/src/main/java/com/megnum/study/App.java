package com.megnum.study;

public class App {

    public static void main(String[] args) {
        System.out.println("hello world");

        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print( array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int colstart = 1;
        int rowStart = 0;
        int curNum=1;

        array[rowStart][colstart] = curNum++;

        //대각선이동 후 값채우기
        rowStart = rowStart - 1;
        colstart = colstart + 1;

        if (rowStart < 0) {
            rowStart = array.length -1;
        }

        array[rowStart][colstart] = curNum++;

        //대각선이동 후 값채우기
        rowStart = rowStart - 1;
        colstart = colstart + 1;

        if (colstart >= array.length) {
            colstart = 0;
        }

        array[rowStart][colstart] = curNum++;

        //대각선이동 후 값채우기
        rowStart = rowStart - 1;
        colstart = colstart + 1;

        if (array[rowStart][colstart] != 0) {
            rowStart = rowStart + 1;
            colstart = colstart - 1;
            rowStart = rowStart + 1;
        }

        array[rowStart][colstart] = curNum++;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print( array[i][j]);
            }
            System.out.println();
        }

    }
}
