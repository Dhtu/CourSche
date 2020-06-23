package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Course;
import java.util.List;

public interface CourseMapper {
    int insert(Course record);

    List<Course> selectAll();
}