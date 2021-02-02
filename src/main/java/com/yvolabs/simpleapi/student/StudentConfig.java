package com.yvolabs.simpleapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.OCTOBER;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {
            Student john = new Student(
                    "john",
                    "john@test.com",
                    LocalDate.of(1999, SEPTEMBER, 27),
                    22

            );

            Student mary = new Student(
                    "mary",
                    "mary@test.com",
                    LocalDate.of(1979, OCTOBER, 27),
                    42

            );

            repository.saveAll(List.of(john,mary));
        };

    }
}

