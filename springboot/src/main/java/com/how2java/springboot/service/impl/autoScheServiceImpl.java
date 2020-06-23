package com.how2java.springboot.service.impl;

import com.how2java.springboot.mapper.ClassRoomMapper;
import com.how2java.springboot.mapper.CourseMapper;
import com.how2java.springboot.mapper.ScheduledCourseMapper;
import com.how2java.springboot.mapper.TeacherMapper;
import com.how2java.springboot.pojo.ClassRoom;
import com.how2java.springboot.pojo.Course;
import com.how2java.springboot.pojo.ScheduledCourse;
import com.how2java.springboot.pojo.Teacher;
import com.how2java.springboot.service.autoScheService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class autoScheServiceImpl implements autoScheService {

    final
    ClassRoomMapper classRoomMapper;

    final
    CourseMapper courseMapper;

    final
    TeacherMapper teacherMapper;

    final
    ScheduledCourseMapper scheduledCourseMapper;

    public autoScheServiceImpl(ClassRoomMapper classRoomMapper, CourseMapper courseMapper, TeacherMapper teacherMapper, ScheduledCourseMapper scheduledCourseMapper) {
        this.classRoomMapper = classRoomMapper;
        this.courseMapper = courseMapper;
        this.teacherMapper = teacherMapper;
        this.scheduledCourseMapper = scheduledCourseMapper;
    }

    @Override
    public void autoSche() {
        System.out.println("start auto schedule");
        List<ClassRoom> classRooms = classRoomMapper.list();
        List<Course> courses = courseMapper.selectAll();
        List<Teacher> teachers = teacherMapper.selectAll();
        List<ScheduledCourse> scheduledCourses = scheduledCourseMapper.selectAll();
        System.out.println(classRooms.size() + "\t" + courses.size() + "\t" + teachers.size() + "\t" + scheduledCourses.size());
        int i = 0;
        for (int j = 0; j < courses.size(); j++) {
            i++;
            int time = j % 70;
            ScheduledCourse scheduledCourse = new ScheduledCourse();
            scheduledCourse.setClassroomid(classRooms.get(i % classRooms.size()).getId());
            scheduledCourse.setDay(time % 7);
            scheduledCourse.setTimeNum(time % 10);
            scheduledCourse.setTeacher(courses.get(j).getCourseTeacher());
            scheduledCourse.setName(courses.get(j).getCourseName());
            scheduledCourseMapper.insert(scheduledCourse);
        }
    }

}

