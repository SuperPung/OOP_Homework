package com.huawei.classroom.student.h04;

public class Triangle {
    private double lenA, lenB, lenC;

    public void setA(double len) {
        this.lenA = len;
    }
    public void setB(double len) {
        this.lenB = len;
    }
    public void setC(double len) {
        this.lenC = len;
    }
    public double getArea() {
        double p = (lenA + lenB + lenC) / 2.0;
        return Math.sqrt(p * (p-lenA) * (p-lenB) * (p-lenC));
    }
}
