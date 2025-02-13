package com.order.controller;

import com.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome user! in order services";
	}
	
	@PostMapping("/place")
	public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
		Order orderInfo = orderService.placeOrder(order);
		return ResponseEntity.ok(orderInfo);
	}
}
