package com.workintech.model.person;

public class Reader extends Person {
    Reader(String name) {
        super(name);
    }

    @Override
    String whoYouAre() {
        return "Okuyucu : " + name;
    }
}
