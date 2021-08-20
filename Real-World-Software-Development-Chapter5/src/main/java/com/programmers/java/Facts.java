package com.programmers.java;

import java.util.HashMap;
import java.util.Map;

public class Facts {

    private Map<String, String> facts = new HashMap<>();

    public String getFact(String name) {
        return this.facts.get(name);
    }

    public Facts setFact(String name, String value) {
        this.facts.put(name, value);
        return this; // 빌더 패턴
    }

}