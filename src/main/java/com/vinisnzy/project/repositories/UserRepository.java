package com.vinisnzy.project.repositories;

import com.vinisnzy.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
