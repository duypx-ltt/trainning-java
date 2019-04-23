package com.example.demo.service;

import com.example.demo.entity.UserProfile;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<UserProfile> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserProfile searchById(int id) {
        return userRepository.findUserProfileById(id);
    }

    @Override
    public List<UserProfile> searchByName(String name) {
        return userRepository.findByNameContaining(name);
    }

    @Override
    public void save(UserProfile user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
