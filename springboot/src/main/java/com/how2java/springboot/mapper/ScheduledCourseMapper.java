package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.ScheduledCourse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScheduledCourseMapper {
    int insert(ScheduledCourse record);

    List<ScheduledCourse> selectAll();
}