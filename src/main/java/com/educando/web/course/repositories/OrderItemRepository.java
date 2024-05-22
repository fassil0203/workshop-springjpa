package com.educando.web.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.web.course.entities.OrderItem;
import com.educando.web.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}