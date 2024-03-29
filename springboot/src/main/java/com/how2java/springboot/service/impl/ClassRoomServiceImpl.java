package com.how2java.springboot.service.impl;

import java.util.List;

import com.how2java.springboot.mapper.ClassRoomMapper;
import com.how2java.springboot.pojo.ClassRoom;
import com.how2java.springboot.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Autowired
    ClassRoomMapper classRoomMapper;

    @Override
    public int add(ClassRoom classRoom) {
        return classRoomMapper.add(classRoom);
    }

    @Override
    public void delete(String id) {
        classRoomMapper.delete(id);
    }

    @Override
    public ClassRoom get(String id) {
//        System.out.println("Impl: "+id);
        return classRoomMapper.get(id);
    }

    @Override
    public int update(ClassRoom classRoom) {
        return classRoomMapper.update(classRoom);
    }

    @Override
    public List<ClassRoom> list() {
        return classRoomMapper.list();
    }

}
