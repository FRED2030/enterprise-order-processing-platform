package com.enterprise.orderplatform.service;

import com.enterprise.orderplatform.domain.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    private final List<Order> orders = new ArrayList<>();

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order createOrder(Order order) {
        order.setId(UUID.randomUUID().toString());
        order.setStatus("PENDING");
        orders.add(order);
        return order;
    }
}
