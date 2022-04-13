package com.schoolofnet.java8;

public class OptionPerson {
    private String name;

    public OptionPerson() {}
    public OptionPerson(String name) { this.name = name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
