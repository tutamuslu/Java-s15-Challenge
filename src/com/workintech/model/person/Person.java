package com.workintech.model.person;

public abstract class Person {
    protected String name;
    abstract String whoYouAre();

    Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
