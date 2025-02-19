package com.api.customerloananalyzer.controlller.dto;

import com.api.customerloananalyzer.domain.Customer;

public record CustomerLoanRequest (Integer age,
                                   String cpf,
                                   String name,
                                   Double income,
                                   String location){

    public Customer toCustomer(){
        return  new Customer(
                age,
                cpf,
                name,
                income,
                location
        );

    }
}
