package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    int insert(Course record);

    List<Course> selectAll();
}