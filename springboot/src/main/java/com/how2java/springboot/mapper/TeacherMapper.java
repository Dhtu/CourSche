package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    int insert(Teacher record);

    List<Teacher> selectAll();
}