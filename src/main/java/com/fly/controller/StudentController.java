package com.fly.controller;

import com.fly.entity.Result;
import com.fly.entity.Student;
import com.fly.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public Result selectAll() {
        log.info("selectAll日志");
        return Result.success(studentService.selectAll());
    }

    @GetMapping(value = "/students/{id}")
    public Result selectById(@PathVariable("id") Integer id) {
        log.info("selectById日志");
        return Result.success(studentService.selectById(id));
    }

    @PostMapping("/students")
    public Result insert(@RequestBody Student student) {
        log.info("insert日志");
        studentService.insert(student);
        return Result.success();
    }

    @DeleteMapping("/students/{id}")
    public Result deleteById(@PathVariable("id") Integer id) {
        log.info("deleteById日志");
        studentService.deleteById(id);
        return Result.success();
    }

    @PutMapping("/students")
    public Result update(@RequestBody Student student) {
        log.info("update日志");
        studentService.update(student);
        return Result.success();
    }
}
