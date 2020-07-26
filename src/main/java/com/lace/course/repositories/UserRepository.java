package com.lace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lace.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
