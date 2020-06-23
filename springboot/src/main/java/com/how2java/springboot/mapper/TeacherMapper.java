package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Teacher;
import java.util.List;

public interface TeacherMapper {
    int insert(Teacher record);

    List<Teacher> selectAll();
}