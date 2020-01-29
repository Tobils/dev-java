package com.bean.demo_bean_qualifier.client;

import java.util.Arrays;

import com.bean.demo_bean_qualifier.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class OrderServiceClient
{
    @Autowired
    @Qualifier("OrderServiceA")
    private OrderService orderService;

    public void showPendingOrderDetails()
    {
        for(String orderId : Arrays.asList("100", "200", "300"))
        {
            System.out.println(orderService.getOrderDetails(orderId));
        }
    }


    @Autowired
    @Qualifier("OrderServiceB")
    private OrderService orderServiceB;

    public void showPendingOrderDetailsB()
    {
        for(String orderId : Arrays.asList("1000", "2000", "3000"))
        {
            System.out.println(orderServiceB.getOrderDetails(orderId));
        }
    }
}