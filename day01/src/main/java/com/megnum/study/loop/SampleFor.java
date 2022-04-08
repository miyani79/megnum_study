package com.megnum.study.loop;

public class SampleFor {

    public void doLoop() {

//        if ( true ) {
//            System.out.println("참일때 수행");
//        }
//
//        for (int i = 0; i<10 ;  ) {
//            i++;
//            System.out.println("무한으로 계쏙...");
//        }
//
//        System.out.println("**********");
//        System.out.println(" ********");
//        System.out.println("  ******");
//        System.out.println("   ****");
//        System.out.println("    ** ");
//        System.out.println("     * ");
//
//        System.out.print("");
//        for (int i = 10; i > 0; i--) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        System.out.print(" ");
//        for (int i = 8; i > 0; i--) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        System.out.print("  ");
//        for (int i = 6; i > 0; i--) {
//            System.out.print("*");
//        }
//        System.out.println();

        int starCnt = 50;
        int inCount = (starCnt / 2) + 1;
        for (int j=0 ; j < inCount ; j++)
        {
            for (int k = 0; k < j; k++) {
                System.out.print("0");
            }

            for (int i = starCnt; i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            starCnt = starCnt - 2;
        }

    }



    public static void main(String[] args) {

        new SampleFor().doLoop();

    }

}
