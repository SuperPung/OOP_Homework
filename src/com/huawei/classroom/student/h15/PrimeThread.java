package com.huawei.classroom.student.h15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author super
 * OVERRIDE RUN !!!
 */
public class PrimeThread extends Thread {
    private final long start;
    private final long end;
    private List<Long> result = new ArrayList<>();
    public PrimeThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public List<Long> getPrime() {
        return result;
    }
    public boolean isPrime(long num) {
        long i;
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        long i;
        for (i = this.start; i < this.end; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
    }
}
