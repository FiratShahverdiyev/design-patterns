package com.company.structural.adapter;

public interface Operable {

    String make(OperationRequestDto operationRequestDto);

    void approve(Operation operation);

}
