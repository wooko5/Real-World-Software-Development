package com.programmers.java;

@FunctionalInterface
public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
    /*
    기존에 반복 로직과 비즈니스 로직이 결합되어있던 코드를 분리하기 위해 함수형 인터페이스 생성
    BankTransactionFilter는 비즈니스 로직을 담당하기 위한 함수형 인터페이스다
    */
}
