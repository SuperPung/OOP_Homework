package com.huawei.classroom.student.h19.q05;

import java.io.*;
import java.util.*;

/**
 * @author super
 */
public class StudentUtil {
    public StudentUtil() {
    }
    public List<Score> initScoreLists(String filename) {
        int i, j;
        List<String[]> scores = readLines(filename);
        Set<String> nameSet = new HashSet<>();
        List<Score> scoreList = new ArrayList<>();
        for (i = 0; i < scores.size(); i++) {
            String name = "";
            int totalScore = 0, chineseScore = 0, mathScore = 0, englishScore = 0;
            List<String> scoreLine = new ArrayList<>(Arrays.asList("", "0", "0", "0", "0"));
            line2list(scores.get(i), scoreLine);
            name = scoreLine.get(0);
            if (nameSet.contains(name)) {
                continue;
            } else {
                nameSet.add(name);
            }
            totalScore += Integer.parseInt(scoreLine.get(4));
            for (j = i + 1; j < scores.size(); j++) {
                if (scores.get(j)[0].equals(name)) {
                    line2list(scores.get(j), scoreLine);
                    totalScore += Integer.parseInt(scoreLine.get(4));
                }
            }

            chineseScore = Integer.parseInt(scoreLine.get(1));
            mathScore = Integer.parseInt(scoreLine.get(2));
            englishScore = Integer.parseInt(scoreLine.get(3));
            Score score = new Score(name, chineseScore, mathScore, englishScore, totalScore);
            scoreList.add(score);
        }
        return scoreList;
    }

    public List<String> sort(String filename){
        int i;
        List<String> result = new ArrayList<>();
        List<Score> scoreLists = initScoreLists(filename);
        scoreLists.sort(new ScoreComparator(-1));
        for (i = 0; i < scoreLists.size(); i++) {
            result.add(scoreLists.get(i).getName());
        }
        return result;
    }
    public List<String[]> readLines(String filename) {
        String line = "";
        Reader reader = null;
        List<String[]> result = new ArrayList<>();
        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (reader == null) {
            return null;
        }
        LineNumberReader lineReader = new LineNumberReader(reader);

        try {
            while (true) {
                line = lineReader.readLine();
                if (line == null) {
                    break;
                }
                result.add(line.replace(";", "").split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @param scoreLine 一行文本
     * @return 0 姓名 1 语文 2 数学 3 英语 4 当前成绩
     */
    public void line2list(String[] scoreLine, List<String> scoreList) {
        String name = scoreLine[0];
        String object = scoreLine[1];
        String score = scoreLine[2];
        scoreList.set(0, name);
        scoreList.set(4, score);
        switch (object) {
            case "语文":
                scoreList.set(1, score);
                break;
            case "数学":
                scoreList.set(2, score);
                break;
            case "英语":
                scoreList.set(3, score);
                break;
            default:
        }
    }
}
