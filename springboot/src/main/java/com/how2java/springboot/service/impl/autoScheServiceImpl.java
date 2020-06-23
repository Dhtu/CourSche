package com.how2java.springboot.service.impl;

import com.how2java.springboot.mapper.ClassRoomMapper;
import com.how2java.springboot.mapper.CourseMapper;
import com.how2java.springboot.mapper.TeacherMapper;
import com.how2java.springboot.pojo.ClassRoom;
import com.how2java.springboot.pojo.Course;
import com.how2java.springboot.pojo.Teacher;
import com.how2java.springboot.service.autoScheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class autoScheServiceImpl implements autoScheService {

    @Autowired
    ClassRoomMapper classRoomMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public void autoSche() {
        System.out.println("start auto schedule");
        List<ClassRoom> classRooms = classRoomMapper.list();
        List<Course> courses = courseMapper.selectAll();
        List<Teacher> teachers = teacherMapper.selectAll();
        System.out.println(classRooms.size() + "\t" + courses.size() + "\t" + teachers.size());
    }
}
