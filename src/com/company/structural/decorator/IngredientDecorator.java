package com.company.structural.decorator;

public abstract class IngredientDecorator extends Pizza {

    private Pizza pizza;

    public IngredientDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }

}
