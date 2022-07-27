package com.example.demo2.date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DateConfig {

    @Bean
    CommandLineRunner commandLineRunner(DateRepository dateRepository) {
        return args -> {
            Datum d1 = new Datum("21/11/1998");
            Datum d2 = new Datum("25/12/1966");

            dateRepository.saveAll(List.of(d1, d2));
        };
    }
}
