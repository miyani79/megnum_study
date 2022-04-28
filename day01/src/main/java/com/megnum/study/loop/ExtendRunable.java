package com.megnum.study.loop;

public class ExtendRunable implements Runnable 
{
    @Override
    public void run() {
        System.out.println("런이 수행되고 있는데 나는 클래스 안에서 수행되고 있어요");
    }
}
