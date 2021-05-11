package com.huawei.classroom.student.h19.q05;


/**
 * @author super
 */
public class Score implements Comparable<Object> {
    private final String name;
    private final int totalScore;
    private final int chineseScore;
    private final int mathScore;
    private final int englishScore;

    public Score(String name, int chineseScore, int mathScore, int englishScore, int totalScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.totalScore = totalScore;
    }
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Score)) {
            return -1;
        }
        if (this.totalScore > ((Score) o).totalScore) {
            return 1;
        } else if (this.totalScore < ((Score) o).totalScore) {
            return -1;
        } else if (this.chineseScore > ((Score) o).chineseScore) {
            return 1;
        } else if (this.chineseScore < ((Score) o).chineseScore) {
            return -1;
        } else if (this.mathScore > ((Score) o).mathScore) {
            return 1;
        } else if (this.mathScore < ((Score) o).mathScore) {
            return -1;
        } else {
            return Integer.compare(this.englishScore, ((Score) o).englishScore);
        }
    }
    public String getName() {
        return name;
    }
}
