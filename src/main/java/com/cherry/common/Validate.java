package com.cherry.common;

import com.cherry.exception.UnExpectException;

public class Validate {

    public static void isTrue(boolean expression ){
        isTrue(expression,"expression is false");
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new UnExpectException(message);
        }
    }
}
