package com.ppfurtado.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Payroll {

    private String workerName;
    private String description;
    private Double hourlyPrice;
    private String workedhours;
    private String totalPayment;
}
