package com.lace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lace.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

