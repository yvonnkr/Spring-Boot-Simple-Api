package com.yvolabs.simpleapi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // Same as @Component only that the @Service is for semantics
public class StudentService {

    public List<Student> getStudents() {
        LocalDate dob = LocalDate.of(1999, Month.SEPTEMBER, 27);
        LocalDate now = LocalDate.now();
        int age = now.getYear() - dob.getYear();

        return List.of(
                new Student(1L,
                        "john",
                        "john@test.com",
                        dob,
                        age)
        );
    }
}
