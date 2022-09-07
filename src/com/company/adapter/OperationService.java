package com.company.adapter;

public class OperationService {

    private final OperationFactory operationFactory;

    public OperationService(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    public String make(OperationRequestDto operationRequestDto) {
        Operable operable = operationFactory.create(operationRequestDto.getOperationType());
        return operable.make(operationRequestDto);
    }

}
