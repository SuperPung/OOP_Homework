package com.huawei.classroom.student.h08;

/**
 * @author super
 */
public class TypeValidator {
    public TypeValidator() {

    }

    public void validate(Object test){
        if (!(test instanceof String)) {
            throw new RuntimeException();
        }
    }

}
