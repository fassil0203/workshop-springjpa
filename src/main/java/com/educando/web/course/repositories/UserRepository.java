package com.educando.web.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.web.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}