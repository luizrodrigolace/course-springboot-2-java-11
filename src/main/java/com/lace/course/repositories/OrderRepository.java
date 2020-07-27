package com.lace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lace.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
