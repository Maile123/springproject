package com.example.demo;


import com.fasterxml.jackson.annotation.JsonTypeId;

class Basic1 {

    private final long id;
    private final String content;

    public Basic1(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
