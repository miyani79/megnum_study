package com.megnum.study.inter;

public class RamenMain {
    public static void main(String[] args) {

        Ramen sinra = new SinRamen();
        Ramen jja = new JJaRamen();

        sinra.조리();

        System.out.println();

        jja.조리();

    }
}
