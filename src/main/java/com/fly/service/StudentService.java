package com.fly.service;

import com.fly.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();

    Student selectById(Integer id);

    void insert(Student student);

    void deleteById(Integer id);

    void update(Student student);
}
