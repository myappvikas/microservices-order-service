package com.order.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double orderAmount;
    private String orderItem;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getOrderAmount() {
        return orderAmount;
    }
    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }
    public String getOrderItem() {
        return orderItem;
    }
    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderAmount=" + orderAmount +
                ", orderItem='" + orderItem + '\'' +
                '}';
    }
}
