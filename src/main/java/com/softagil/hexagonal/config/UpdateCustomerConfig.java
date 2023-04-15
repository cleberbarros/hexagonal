package com.softagil.hexagonal.config;

import com.softagil.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.softagil.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.softagil.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.softagil.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.softagil.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter,updateCustomerAdapter);
    }
}
