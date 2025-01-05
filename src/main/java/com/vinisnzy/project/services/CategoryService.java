package com.vinisnzy.project.services;

import com.vinisnzy.project.entities.Category;
import com.vinisnzy.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> optional = repository.findById(id);
        return optional.get();
    }
}
