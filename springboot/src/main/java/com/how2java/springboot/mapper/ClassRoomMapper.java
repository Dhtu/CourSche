package com.how2java.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.how2java.springboot.pojo.ClassRoom;

@Mapper
public interface ClassRoomMapper {
    public int add(ClassRoom classRoom);

    public void delete(String id);

    public ClassRoom get(String id);

    public int update(ClassRoom classRoom);

    public List<ClassRoom> list();
}