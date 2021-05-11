package com.huawei.classroom.student.h04;

/**
 * @author super
 */
public class MyStack {
    private int maxSize;
    private int[] stack;
    private int top;

    public MyStack(int size) {
        this.maxSize = size;
        this.stack = new int[this.maxSize];
        this.top = -1;
    }
    public int pop() {
        if (this.top == -1)
            return 0;
        else
            return this.stack[top--];
    }
    public void push(int e) {
        this.stack[++top] = e;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == this.maxSize - 1;
    }
}
