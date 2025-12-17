package com.example.demo.service.impl;
import java.util.*;
import org.springframework.stereotype.service;
import com.example.demo.entity.Student;
@service
public class StudentServiceimpl implements StudentService{
    private final Map<Long,Student>
    store=new HashMap<>();
    private long counter=1;
    @Override
    public Student insertStudent(Student st){
        st.setld(counter++);
        store.put(st,getId()
    }
}