package com.company.adapter;

public class OperationFactory {

    private final Hire hire;
    private final WorkVacationAdapter workVacationAdapter;

    public OperationFactory(Hire hire, WorkVacationAdapter workVacationAdapter) {
        this.hire = hire;
        this.workVacationAdapter = workVacationAdapter;
    }

    public Operable create(OperationType operationType) {
        switch (operationType) {
            case HIRE:
                return hire;
            case WORK_VACATION:
                return workVacationAdapter;
            default:
                return null;
        }
    }

}
