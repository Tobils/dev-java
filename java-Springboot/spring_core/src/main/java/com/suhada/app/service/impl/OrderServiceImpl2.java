package com.suhada.app.service.impl;

import com.suhada.app.service.OrderService;;

public class OrderServiceImpl2 implements OrderService
{

	public String getOrderServiceDetail(String orderId) {
        String msg = "Order details from impl1 for order Id " + orderId;
		return msg;
	}
    
}