package com.huawei.classroom.student.h18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author super
 */
public class Param {
    /**
     * HashMap<类名, HashMap<属性名, 属性值>>
      */
    private final Map<String, Map<String, Object>> allParamsMap = new HashMap<>();

    public Param(String filename) throws IOException {
        readLines(filename);
    }

    public Map<String, Object> getParamMap(String className) {
        return allParamsMap.get(className);
    }

    private void readLines(String filename) throws IOException {
        InputStream in = new FileInputStream(filename);
        InputStreamReader inReader = new InputStreamReader(in, StandardCharsets.UTF_8);
        LineNumberReader lineReader = new LineNumberReader(inReader);
        String line = lineReader.readLine();

        while (line != null) {
            if (line.startsWith("#") || line.trim().length() == 0) {
                // no continue or dead loop
            } else {
                // [类的完整路径名].[属性]="一个字符串"/或者一个整数
                String[] strs = line.split("=");
                String left = strs[0];
                String right = strs[1];
                // [类的完整路径名].[属性]
                int dotPos = left.lastIndexOf(".");
                String className = left.substring(0, dotPos);
                String paramName = left.substring(dotPos + 1);
                // [属性]="一个字符串"/或者一个整数
                Map<String, Object> paramMap = null;
                if (allParamsMap.containsKey(className)) {
                    paramMap = allParamsMap.get(className);
                } else {
                    paramMap = new HashMap<>();
                }
                // "一个字符串"/或者一个整数
                if (right.startsWith("\"")) {
                    paramMap.put(paramName, right.substring(1, right.length() - 1));
                } else {
                    paramMap.put(paramName, Integer.parseInt(right));
                }
                allParamsMap.put(className, paramMap);
            }
            line = lineReader.readLine();
        }
    }
}
