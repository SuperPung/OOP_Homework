package com.huawei.classroom.student.h08;

/**
 * @author super
 */
public class LoginUtil {
    private static final String VALID_USERNAME = "a";
    private static final String VALID_PASSWD = "a";
    public LoginUtil() {

    }

    public void login(String username, String passwd) throws InvalidUserExcetpion{
        if (!username.equals(VALID_USERNAME) || !passwd.equals(VALID_PASSWD)) {
            throw new InvalidUserExcetpion();
        }
    }
}
