package com.bigxodus.common;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 4. 17.
 * @note:
 */
public class Util {

    public static <T> List<T> toList(T obj) {
        return java.util.Arrays.asList(obj);
    }
}
