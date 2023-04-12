package com.softagil.hexagonal.application.ports.in;

import com.softagil.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
