package com.enigmacamp.project.repository;

import com.enigmacamp.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    @Query(value = "SELECT * FROM students WHERE LOWER(fullname) LIKE %?1%", nativeQuery = true)
    List<Student> findByFullname(String fullname);
}
