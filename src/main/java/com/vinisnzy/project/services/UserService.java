package com.vinisnzy.project.services;

import com.vinisnzy.project.entities.User;
import com.vinisnzy.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> optional = repository.findById(id);
        return optional.get();
    }
}
