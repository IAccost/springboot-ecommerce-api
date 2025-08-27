package com.kproject.springb.repositories;

import com.kproject.springb.entities.OrderItem;
import com.kproject.springb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
