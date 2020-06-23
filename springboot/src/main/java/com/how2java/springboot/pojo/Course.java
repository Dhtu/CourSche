package com.how2java.springboot.pojo;

import java.io.Serializable;

public class Course implements Serializable {
    private String id;

    private Float credit;

    private String intro;

    private String name;

    private Integer numLessonsEachWeek;

    private Short departmentId;

    private Short majorId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNumLessonsEachWeek() {
        return numLessonsEachWeek;
    }

    public void setNumLessonsEachWeek(Integer numLessonsEachWeek) {
        this.numLessonsEachWeek = numLessonsEachWeek;
    }

    public Short getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Short departmentId) {
        this.departmentId = departmentId;
    }

    public Short getMajorId() {
        return majorId;
    }

    public void setMajorId(Short majorId) {
        this.majorId = majorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", credit=").append(credit);
        sb.append(", intro=").append(intro);
        sb.append(", name=").append(name);
        sb.append(", numLessonsEachWeek=").append(numLessonsEachWeek);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", majorId=").append(majorId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}