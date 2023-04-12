package com.softagil.hexagonal.application.ports.out;

import com.softagil.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
