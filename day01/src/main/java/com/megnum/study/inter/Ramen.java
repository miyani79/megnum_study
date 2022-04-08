package com.megnum.study.inter;

import java.util.Collections;
import java.util.List;

abstract public class Ramen {

    private void 물끓이기() {
        System.out.println("물을 끓입니다.");
    }

    private void 그릇에담기() {
        System.out.println("그릇에 담았다");
    }

    abstract void 상세조리() ;

    public void 조리() {
        this.물끓이기();
        this.상세조리();
        this.그릇에담기();
    }

}
