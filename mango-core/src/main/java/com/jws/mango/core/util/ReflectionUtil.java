package com.jws.mango.core.util;

import com.jws.mango.core.exception.MangoException;

public abstract class ReflectionUtil {
    public static Object invoke(String methodName, Object target, Object... args) {
        try {
            return target.getClass().getMethod(methodName).invoke(target, args);
        } catch (Exception e) {
            throw new MangoException("Can not find the mapper's method");
        }
    }
}
