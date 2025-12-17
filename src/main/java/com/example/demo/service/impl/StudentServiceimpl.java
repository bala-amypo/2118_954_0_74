package com.example.demo.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Studentity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.Studservice;

@Service
public class StudentServiceimpl implements Studservice {

    @Autowired
    private StudentRepo repo;

    @Override
    public Studentity saveData(Studentity st) {
        return repo.save(st);
    }

    @Override
    public Collection<Studentity> getAll() {
        return repo.findAll();
    }

    @Override
    public Studentity getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Studentity update(int id, Studentity st) {
        st.setId(id);
        return repo.save(st);
    }
}
