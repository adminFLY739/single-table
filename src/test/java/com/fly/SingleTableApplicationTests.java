package com.fly;

import com.fly.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SingleTableApplicationTests {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test() {
        Student student = new Student();
        student.setId(7);
        student.setName("徐文杰");
        student.setAge(101);
        student.setGender((short) 1);
        student.setUpdateTime(LocalDateTime.now());
        studentMapper.update(student);
        System.out.println(studentMapper.selectAll());
    }

}
