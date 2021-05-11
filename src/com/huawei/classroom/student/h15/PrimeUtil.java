package com.huawei.classroom.student.h15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author super
 */
public class PrimeUtil {
    public PrimeUtil() {

    }

    public List<Long> getPrimeList(long start, long end, int threadCount) {
        int i;
        List<Long> result = new ArrayList<>();
        PrimeThread[] threads = new PrimeThread[threadCount];
        for (i = 0; i < threadCount; i++) {
            long threadStart = start + (end - start) / threadCount * i;
            long threadEnd = start + (end - start) / threadCount * (i + 1);
            threads[i] = new PrimeThread(threadStart, threadEnd);
            threads[i].start();
        }
        for (i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
                result.addAll(threads[i].getPrime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
