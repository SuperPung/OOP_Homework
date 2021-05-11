package com.huawei.classroom.student.h19.q03;

/**
 * @author super
 */
public class ArrayUtil {
    public ArrayUtil() {
    }

    public int getMin(int[] array) {
        int min = array[0];
        for (int arrayEle : array) {
            min = Math.min(min, arrayEle);
        }
        return min;
    }
}
