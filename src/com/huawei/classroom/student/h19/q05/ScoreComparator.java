package com.huawei.classroom.student.h19.q05;

import java.util.Comparator;

/**
 * @author super
 */
public class ScoreComparator implements Comparator<Score> {
    /**
     * 1 asc
     * -1 des
      */
    private final int order;
    public ScoreComparator(int order) {
        super();
        this.order = order;
    }
    @Override
    public int compare(Score s1, Score s2) {
        int result = s1.compareTo(s2);
        if (this.order == 1) {
            return result;
        } else {
            return -result;
        }
    }
}
