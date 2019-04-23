package com.example.demo.service;

import com.example.demo.entity.UserProfile;

import java.util.List;

public interface UserService {
    Iterable<UserProfile> findAll();

    UserProfile searchById(int id);

    List<UserProfile> searchByName(String name);

    void save(UserProfile user);

    void delete(Integer id);
}
