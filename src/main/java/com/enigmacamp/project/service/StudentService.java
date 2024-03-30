package com.enigmacamp.project.service;

import com.enigmacamp.project.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    Student getStudentById(String id);
    void deleteStudentById(String id);
    Student updateStudent(Student student);
    List<Student> getAllStudent();
}
