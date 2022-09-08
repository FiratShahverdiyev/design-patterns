package com.company.structural.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        Person footballAthlete = new Athlete(new Football());
        System.out.println(footballAthlete.getPosition());
    }

}
