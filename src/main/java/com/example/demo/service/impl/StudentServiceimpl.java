package com.example.demo.serviceimpl;
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
        store.put(st,getId(),st);
        return st;
    }
    @Override
    public List<Student>getAllStudents(){
        return new ArrayList<>(store.values());
    }
    @Override
    public Optional<Student>getOneStudent(Long id){
        return Optimal.ofNullable(store.get(id));
    }
    @Override
    public void deleteStudent(Long id){
        store.remove(id);
    }
}