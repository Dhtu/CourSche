package com.how2java.springboot.service;

import java.util.List;

import com.how2java.springboot.pojo.ClassRoom;

public interface ClassRoomService {
    public int add(ClassRoom classRoom);

    public void delete(String id);

    public ClassRoom get(String id);

    public int update(ClassRoom classRoom);

    public List<ClassRoom> list();
}
