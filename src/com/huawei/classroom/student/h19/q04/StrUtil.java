package com.huawei.classroom.student.h19.q04;

/**
 * @author super
 */
public class StrUtil {
    public StrUtil() {

    }

    public String removeDulpicatedChar(String str) {
        int i;
        StringBuilder result = new StringBuilder();
        for (i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if (!isInSet(curChar, result)) {
                result.append(curChar);
            }
        }
        return result.toString();
    }
    public boolean isInSet(char cha, StringBuilder set) {
        int i;
        for (i = 0; i < set.length(); i++) {
            if (cha == set.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
