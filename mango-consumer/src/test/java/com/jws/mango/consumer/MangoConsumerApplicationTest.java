package com.jws.mango.consumer;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertArrayEquals;

public class MangoConsumerApplicationTest {
    @Test
    public void findSecondMaxLength() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String[] strs = new String[]{"cc", "bbb", "a", "kkkkk", "hh", "123123", "abcd", "121212", "tatat", "w3", null, "22112", ""};

        StringArrayUtils obj2 = StringArrayUtils.getInstance();

        String[] result = obj2.findSecondMaxLength(strs);

        assertArrayEquals(new String[]{"kkkkk", "tatat", "22112"}, result);
    }

    @Test(expected = InvocationTargetException.class)
    public void findSecondMaxLengthWithException() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String[] strs = new String[]{"cc", "bbb", "a", "kkkkk", "hh", "123123", "abcd", "121212", "tatat", "w3", null, "22112", ""};

        StringArrayUtils obj2 = StringArrayUtils.getInstance();

        String[] result = obj2.findSecondMaxLength(strs);

        assertArrayEquals(new String[]{"kkkkk", "tatat", "22112"}, result);

        Constructor constructor = Class.forName("com.jws.mango.consumer.StringArrayUtils").getDeclaredConstructor();
        constructor.setAccessible(true);
        StringArrayUtils obj1 = (StringArrayUtils) constructor.newInstance();
    }
}