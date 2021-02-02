package com.yvolabs.simpleapi.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // below is a custom method equivalent to this sql query:
    // SELECT * FROM student WHERE email = ?;

    // This Jdql not sql --Can add @Query or Not
//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
