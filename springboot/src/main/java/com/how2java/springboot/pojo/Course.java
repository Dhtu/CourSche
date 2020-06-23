package com.how2java.springboot.pojo;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseId;
    private String courseName;
    private String courseTeacher;
    private String semester;
    private String department;
    private String credit;
    private String introduction;
    private String examTime;
    private String courseTime;
    private String coursePlace;
    private String ifSingleWeek;
    private String capacity;

    public String getCapacity() {
        return capacity;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCoursePlace() {
        return coursePlace;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public String getCredit() {
        return credit;
    }

    public String getDepartment() {
        return department;
    }

    public String getExamTime() {
        return examTime;
    }

    public String getIfSingleWeek() {
        return ifSingleWeek;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getSemester() {
        return semester;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCoursePlace(String coursePlace) {
        this.coursePlace = coursePlace;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public void setIfSingleWeek(String ifSingleWeek) {
        this.ifSingleWeek = ifSingleWeek;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseTeacher='" + courseTeacher + '\'' +
                ", semester='" + semester + '\'' +
                ", department='" + department + '\'' +
                ", credit='" + credit + '\'' +
                ", introduction='" + introduction + '\'' +
                ", examTime='" + examTime + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", coursePlace='" + coursePlace + '\'' +
                ", ifSingleWeek='" + ifSingleWeek + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}