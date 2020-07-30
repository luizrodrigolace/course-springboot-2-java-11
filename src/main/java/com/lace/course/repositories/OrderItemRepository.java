package com.lace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lace.course.entities.OrderItem;
import com.lace.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}