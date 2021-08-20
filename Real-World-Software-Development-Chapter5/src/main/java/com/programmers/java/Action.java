package com.programmers.java;

import com.programmers.java.Facts;

@FunctionalInterface
interface Action{
    void execute(Facts facts);
}