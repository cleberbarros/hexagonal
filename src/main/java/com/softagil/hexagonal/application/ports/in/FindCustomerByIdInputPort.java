package com.softagil.hexagonal.application.ports.in;

import com.softagil.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
