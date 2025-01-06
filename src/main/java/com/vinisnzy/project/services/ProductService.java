package com.vinisnzy.project.services;

import com.vinisnzy.project.entities.Product;
import com.vinisnzy.project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> optional = repository.findById(id);
        return optional.get();
    }
}
