package com.company.structural.adapter;

public class WorkVacation {

    private String importantString;

    public WorkVacation(String importantString) {
        this.importantString = importantString;
    }

    public String make(OldOperationRequestDto oldOperationRequestDto) {
        return "WorkVacation " + importantString;
    }

    public void approve(Integer id) {

    }

}
