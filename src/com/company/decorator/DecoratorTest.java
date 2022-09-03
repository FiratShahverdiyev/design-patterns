package com.company.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Pizza chickenWithCheese = new CheeseDecorator(new ChickenPizza());
        System.out.println(chickenWithCheese.getCost());
        Pizza pepperoniWithTomatoAndCheese = new TomatoDecorator(new CheeseDecorator(new PepperoniPizza()));
        System.out.println(pepperoniWithTomatoAndCheese.getCost());
    }

}
