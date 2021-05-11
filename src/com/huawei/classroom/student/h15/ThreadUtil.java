package com.huawei.classroom.student.h15;

/**
 * @author super
 */
public class ThreadUtil extends Thread {
    private final StringBuffer buffer;
    public ThreadUtil(StringBuffer buf) {
        this.buffer = buf;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.buffer.append("ok");
    }
}
