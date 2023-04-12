package com.softagil.hexagonal.application.core.usecase;

import com.softagil.hexagonal.application.core.domain.Customer;
import com.softagil.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase  {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort){
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow( () -> new RuntimeException("Customer not found"));
    }
}
