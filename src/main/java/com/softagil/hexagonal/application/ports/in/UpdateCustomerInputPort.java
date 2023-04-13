package com.softagil.hexagonal.application.ports.in;

import com.softagil.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
