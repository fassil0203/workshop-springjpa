package com.educando.web.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.web.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
