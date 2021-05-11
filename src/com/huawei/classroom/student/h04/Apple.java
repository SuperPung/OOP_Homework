package com.huawei.classroom.student.h04;

public class Apple {
    private String color;
    private int size;

    public Apple() {
        this.color = "red";
        this.size = 0;
    }
    public Apple(String color, int size) {
        this.color = color;
        if (size >= 0)
            this.size = size;
        else
            this.size = 0;
    }
    public Apple(int size, String color) {
        this(color, size);
    }

    public String getColor() {
        return this.color;
    }
    public int getSize() {
        return this.size;
    }
}
