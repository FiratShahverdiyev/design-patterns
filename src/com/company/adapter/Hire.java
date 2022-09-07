package com.company.adapter;

public class Hire extends Operation implements Operable {

    @Override
    public String make(OperationRequestDto operationRequestDto) {
        return "Hire";
    }

    @Override
    public void approve(Operation operation) {

    }

}
