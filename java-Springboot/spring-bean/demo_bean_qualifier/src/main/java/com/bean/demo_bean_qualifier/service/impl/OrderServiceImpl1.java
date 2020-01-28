package com.bean.demo_bean_qualifier.service.impl;

import com.bean.demo_bean_qualifier.service.OrderService;

public class OrderServiceImpl1 implements OrderService
{
    public String getOrderDetails(String orderId)
    {
        return "order details from impl 1, for order id " + orderId;
    }
}