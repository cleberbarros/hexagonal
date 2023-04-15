package com.softagil.hexagonal.config;

import com.softagil.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.softagil.hexagonal.adapters.out.InsertCustomerAdapter;
import com.softagil.hexagonal.adapters.out.SendCpfValiationAdapter;
import com.softagil.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    //PRECISAR CRIAR UM BEAN PARA CASA USECASE JÁ QUE OS MESMO NÃO ESTÃO SENDO GERENCIADOS PELO SPRING
    //NOTA-SE QUE EM CADA MÉTODO FOI PASSADO O ADAPTER E NÃO A PORTA QUE É UTILIZADA NO CONSTRUTOR DO USER CASE

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValiationAdapter sendCpfValiationAdapter
    ){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,insertCustomerAdapter,sendCpfValiationAdapter);
    }
}
