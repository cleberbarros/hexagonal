package com.softagil.hexagonal.config;

import com.softagil.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.softagil.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    //PRECISAR CRIAR UM BEAN PARA CASA USECASE JÁ QUE OS MESMO NÃO ESTÃO SENDO GERENCIADOS PELO SPRING
    //NOTA-SE QUE EM CADA MÉTODO FOI PASSADO O ADAPTER E NÃO A PORTA QUE É UTILIZADA NO CONSTRUTOR DO USER CASE

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
