package com.programmers.java;

import com.programmers.java.Facts;

@FunctionalInterface
public interface Condition {

    boolean evaluate(Facts facts);
}