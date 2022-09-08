package com.company.structural.bridge;

public class Athlete extends Person {

    public Athlete(Sport sport) {
        super(sport);
    }

    @Override
    public String getPosition() {
        return "Athlete" + " " + sport.getDescription();
    }

}
