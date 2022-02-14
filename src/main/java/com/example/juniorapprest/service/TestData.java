package com.example.juniorapprest.service;

public enum TestData {
    FULLNAME("Test Testov");

    private final String fullname;
    TestData(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }
}
