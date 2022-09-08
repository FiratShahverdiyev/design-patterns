package com.company.structural.bridge;

public abstract class Person {

    protected Sport sport;

    public Person(Sport sport) {
        this.sport = sport;
    }

    public abstract String getPosition();

}
