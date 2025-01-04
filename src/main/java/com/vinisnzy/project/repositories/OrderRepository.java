package com.vinisnzy.project.repositories;

import com.vinisnzy.project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
