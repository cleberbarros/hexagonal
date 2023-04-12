package com.softagil.hexagonal.adapters.out.repository.mapper;

import com.softagil.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.softagil.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
