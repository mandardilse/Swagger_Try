package com.swager.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import openapi.api.ContactApiApi;
import openapi.client.ApiClient;

@Configuration
public class ContactConfiguration {
    
    @Bean
    public ApiClient apiClient() {
        return new ApiClient();
    }

    @Bean
    public ContactApiApi contactApi() {
        return new ContactApiApi(apiClient());
    }
}
