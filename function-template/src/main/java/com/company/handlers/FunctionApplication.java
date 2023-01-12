package com.company.handlers;

import com.company.functions.TemplateFunction;
import com.company.models.TemplateRequest;
import com.company.models.TemplateResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class FunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunctionApplication.class, args);
    }

    @Bean
    public Function<TemplateRequest, TemplateResponse> handle() {
        return new TemplateFunction();
    }
}
