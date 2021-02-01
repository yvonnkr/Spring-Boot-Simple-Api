package com.yvolabs.simpleapi.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping
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
