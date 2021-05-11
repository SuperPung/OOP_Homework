package com.huawei.classroom.student.h08;

/**
 * @author super
 */
public class AgeCheck implements AgeCheckInterface{
    private static final int MIN = 0;
    private static final int MAX = 200;

    public AgeCheck() {

    }

    @Override
    public void checkAge(int age) {
        if (age < MIN || age > MAX) {
            throw new RuntimeException();
        }
    }
}
