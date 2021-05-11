package com.huawei.classroom.student.h18;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author super
 */
public class MyClassFactory {
    private final Param params;

    public MyClassFactory(String filename) throws IOException {
        params = new Param(filename);
    }

    /**
     *
     * @param clazz 类
     * @param <T> 类型
     * @return 类型
     * setter (getter in Test)
     */
    public <T> T createInstance(Class<T> clazz)
            throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        String className = clazz.getName();
        T t = clazz.newInstance();
        Map<String, Object> paramMap = params.getParamMap(className);
        for (String param : paramMap.keySet()) {
            Object value = paramMap.get(param);
            String methodName = "set" + param.substring(0, 1).toUpperCase() + param.substring(1);
            dynamicInvokeMethod(t, methodName, value);
        }
        return t;
    }

    /**
     * 动态调用赋值
     */
    public void dynamicInvokeMethod(Object obj, String methodName, Object... values)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int i;
        Class<?>[] classes = new Class[values.length];
        for (i = 0; i < values.length; i++) {
            classes[i] = values[i].getClass();
        }
        Method method = obj.getClass().getMethod(methodName, classes);
        method.invoke(obj, values);
    }
}
