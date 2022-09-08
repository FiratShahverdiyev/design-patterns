package com.company.structural.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        OperationService operationService = new OperationService(new OperationFactory(new Hire(),
                new WorkVacationAdapter(new WorkVacation("very important text"))));
        OperationRequestDto operationRequestDto = new OperationRequestDto();
        operationRequestDto.setOperationType(OperationType.WORK_VACATION);
        System.out.println(operationService.make(operationRequestDto));
    }

}
