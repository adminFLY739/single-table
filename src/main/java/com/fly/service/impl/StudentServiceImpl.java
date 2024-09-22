package com.fly.service.impl;

import com.fly.entity.Student;
import com.fly.mapper.StudentMapper;
import com.fly.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public Student selectById(Integer id) {
        return studentMapper.selectById(id);
    }

    @Override
    public void insert(Student student) {
        student.setCreateTime(LocalDateTime.now());
        student.setUpdateTime(LocalDateTime.now());
        studentMapper.insert(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteById(id);
    }

    @Override
    public void updateById(Integer id, Student student) {
        Student temp = studentMapper.selectById(id);
        student.setId(temp.getId());
        student.setUpdateTime(LocalDateTime.now());
        studentMapper.updateById(student);
    }
}
