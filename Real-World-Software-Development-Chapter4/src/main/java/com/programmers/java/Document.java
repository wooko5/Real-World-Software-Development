package com.programmers.java;

import java.util.Map;

// tag::document[]
public class Document { // 문서에 관한 클래스
    private final Map<String, String> attributes;

    Document(final Map<String, String> attributes) { // 해시맵을 이용해서 키, 값을 한쌍으로 저장
        this.attributes = attributes;
    }

    public String getAttribute(final String attributeName) { // 해시 값을 조회하는 getter함수
        return attributes.get(attributeName);
    }
}
// end::document[]
