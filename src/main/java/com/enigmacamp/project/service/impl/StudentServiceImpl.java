package com.enigmacamp.project.service.impl;

import com.enigmacamp.project.entity.Student;
import com.enigmacamp.project.repository.StudentRepository;
import com.enigmacamp.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Autowired
    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        if (studentRepository.findById(student.getId()).isPresent()) {
            return saveStudent(student);
        }else {
            throw new RuntimeException("Student with id " + student.getId() + " not found");
        }
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public List<Student> findByName(String name) {
        return studentRepository.findByFullname(name);
    }
}
