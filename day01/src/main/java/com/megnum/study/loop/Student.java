package com.megnum.study.loop;

import java.util.Objects;

public class Student
{
    public static int MY_NUMBER = 20;
    private int korP = 0;
    private int engP = 0;
    protected int historyPoint = 0;
    String stdNum = "0000000";

    public int getKorP() {
        return korP;
    }

    public void setKorP(int korP) {
        this.korP = korP;
    }

    public int getHistoryPoint() {
        return historyPoint;
    }

    public void setHistoryPoint(int historyPoint) {
        this.historyPoint = historyPoint;
    }

    public String getStdNum() {
        return stdNum;
    }

    public void setStdNum(String stdNum) {
        this.stdNum = stdNum;
    }

    public boolean same(Student student) {
        return this.stdNum.equals( student.stdNum );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(stdNum, student.stdNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stdNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "korP=" + korP +
                ", engP=" + engP +
                ", historyPoint=" + historyPoint +
                ", stdNum='" + stdNum + '\'' +
                '}';
    }
}
