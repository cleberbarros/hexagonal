package com.softagil.hexagonal.application.ports.out;

import com.softagil.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
