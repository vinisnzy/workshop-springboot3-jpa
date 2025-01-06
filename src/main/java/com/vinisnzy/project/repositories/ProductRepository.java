package com.vinisnzy.project.repositories;

import com.vinisnzy.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
