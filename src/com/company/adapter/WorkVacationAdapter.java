package com.company.adapter;

public class WorkVacationAdapter implements Operable {

    private final WorkVacation workVacation;

    public WorkVacationAdapter(WorkVacation workVacation) {
        this.workVacation = workVacation;
    }

    @Override
    public String make(OperationRequestDto operationRequestDto) {
        OldOperationRequestDto oldOperationRequestDto = new OldOperationRequestDto();
        return workVacation.make(oldOperationRequestDto);
    }

    @Override
    public void approve(Operation operation) {
        workVacation.approve(operation.getId());
    }

}
