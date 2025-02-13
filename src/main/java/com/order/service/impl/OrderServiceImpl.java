package com.order.service.impl;

import com.order.entity.Order;
import com.order.repository.OrderRepository;
import com.order.service.OrderService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional
    public Order placeOrder(Order order) {
        if(order != null){
            orderRepository.save(order);
        }
        return order;
    }
}
