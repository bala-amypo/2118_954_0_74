package com.example.demo.service;

import java.util.Collection;
import com.example.demo.entity.Studentity;

public interface Studservice {
    Studentity saveData(Studentity st);
    Collection<Studentity> getAll();
    Studentity getById(int id);
    Studentity update(int id, Studentity st);
}
