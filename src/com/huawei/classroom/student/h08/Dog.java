package com.huawei.classroom.student.h08;

/**
 * @author super
 */
public class Dog {
    private int count;
    private static final int MAX_FEED_COUNT = 3;
    public Dog() {
        this.count = 0;
    }

    public void feed() throws Exception{
        if (this.count < MAX_FEED_COUNT) {
            this.count++;
        } else {
            throw new Exception("I can not eat more!");
        }
    }
}
