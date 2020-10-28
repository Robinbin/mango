package com.jws.mango.consumer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringArrayUtils {
    private static StringArrayUtils instance = null;
    private static boolean flag = false;

    private StringArrayUtils() {
        if (flag) {
            throw new RuntimeException("Singleton class can't create multi-instances.");
        }
    }

    public static StringArrayUtils getInstance() {
        if (instance == null) {
            synchronized (StringArrayUtils.class) {
                if (instance == null) {
                    instance = new StringArrayUtils();

                    flag = true;
                }
            }
        }

        return instance;
    }

    public String[] findSecondMaxLength(String[] strs) {
        List<String> str = Arrays.asList(strs);

        Integer secondMaxLength = (Integer) str.stream()
                .filter(Objects::nonNull)
                .mapToInt(String::length)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toArray()[2];

        return str.stream()
                .filter(s -> Objects.nonNull(s) && s.length() == secondMaxLength)
                .collect(Collectors.toList())
                .toArray(new String[]{});
    }
}
