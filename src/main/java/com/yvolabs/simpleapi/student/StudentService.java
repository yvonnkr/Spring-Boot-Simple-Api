package com.yvolabs.simpleapi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Same as @Component only that the @Service is for semantics
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {

        return studentRepository.findAll();
    }
}

/**
 * LocalDate dob = LocalDate.of(1999, Month.SEPTEMBER, 27);
 *         LocalDate now = LocalDate.now();
 *         int age = now.getYear() - dob.getYear();
 * new Student(1L,
 *                         "john",
 *                         "john@test.com",
 *                         dob,
 *                         age)
 */
