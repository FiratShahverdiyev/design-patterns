package com.company.structural.decorator;

public class TomatoDecorator extends IngredientDecorator {

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }

}
