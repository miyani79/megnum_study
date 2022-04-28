package com.megnum.study.loop;

import java.util.Scanner;

public class OddNum2 {

    public static void main(String[] args) {
        System.out.println("홀수를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] array = new int[n][n];
        //n=5
        int rowStart = 0;
        int colStart = n/2; //2
        int curNum=1;

        while (curNum <= n*n)
        {
            array[rowStart][colStart] = curNum;

            if (curNum % n == 0) { //값이 있을 경우
                rowStart++;
            }
            else  { //값의 범위를 벗어났을 때 벗어난 위치의 반대편으로
                rowStart--;
                colStart++;
            }

            if (rowStart < 0) {//값의 범위를 벗어났을 경우
                rowStart = n - 1;
            }

            if (rowStart >= n) { //n*n 범위를 벗어났을 경우 그 줄의 반대로
                rowStart = 0;
            }

            if (colStart < 0) {
                colStart = n - 1;
            }

            if(colStart >= n) {
                colStart = 0;
            }

            curNum++;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print( array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
