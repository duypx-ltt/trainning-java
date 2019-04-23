package com.example.demo.repository;

import com.example.demo.entity.UserProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserProfile, Integer> {

    List<UserProfile> findByNameContaining(String name);

    UserProfile findUserProfileById(int id);

}
