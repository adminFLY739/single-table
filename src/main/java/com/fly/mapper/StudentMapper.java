package com.fly.mapper;

import com.fly.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> selectAll();

    @Select("select * from student where id = #{id}")
    Student selectById(Integer id);

    @Insert("insert into student(name,age,gender,create_time,update_time) values(#{name},#{age},#{gender},#{createTime},#{updateTime})")
    void insert(Student student);

    @Delete("delete from student where id = #{id}")
    void deleteById(Integer id);

    @Update("update student set name = #{name},age = #{age},gender = #{gender},update_time = #{updateTime} where id = #{id}")
    void update(Student student);
}
