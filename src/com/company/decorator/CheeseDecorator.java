package com.company.decorator;

public class CheeseDecorator extends IngredientDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

}
