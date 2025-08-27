package com.kproject.springb.services;

import com.kproject.springb.entities.Order;
import com.kproject.springb.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository userRepository;

    public List<Order> findAll() {
        return userRepository.findAll();
    }
    public Order findById(Long id) {
        Optional<Order> obj = userRepository.findById(id);
        return obj.get();
    }
}
