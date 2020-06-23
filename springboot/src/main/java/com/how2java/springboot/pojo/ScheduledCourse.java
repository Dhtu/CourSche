package com.how2java.springboot.pojo;

import java.io.Serializable;

public class ScheduledCourse implements Serializable {
    private Integer id;

    private String name;

    private Integer day;

    private String classroomid;

    private String teacher;

    private Integer timeNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(String classroomid) {
        this.classroomid = classroomid == null ? null : classroomid.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public Integer getTimeNum() {
        return timeNum;
    }

    public void setTimeNum(Integer timeNum) {
        this.timeNum = timeNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", day=").append(day);
        sb.append(", classroomid=").append(classroomid);
        sb.append(", teacher=").append(teacher);
        sb.append(", timeNum=").append(timeNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}