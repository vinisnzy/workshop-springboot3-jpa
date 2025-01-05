package com.vinisnzy.project.repositories;

import com.vinisnzy.project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
