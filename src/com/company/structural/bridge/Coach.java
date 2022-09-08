package com.company.structural.bridge;

public class Coach extends Person {

    public Coach(Sport sport) {
        super(sport);
    }

    @Override
    public String getPosition() {
        return "Coach" + " " + sport.getDescription();
    }

}
