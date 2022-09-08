package com.company.structural.adapter;

public class Hire extends Operation implements Operable {

    @Override
    public String make(OperationRequestDto operationRequestDto) {
        return "Hire";
    }

    @Override
    public void approve(Operation operation) {

    }

}
