package com.softagil.hexagonal.application.ports.out;

import com.softagil.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
