package com.educando.web.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.web.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
