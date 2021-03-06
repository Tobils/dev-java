package com.suhada.app;

import com.suhada.app.service.OrderService;
import com.suhada.app.service.impl.OrderServiceImpl1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterBasedDI
{
    @Bean
    public OrderService orderServiceProvider1()
    {
        return new OrderServiceImpl1();
    }


    @Bean
    public OrderServiceClient createClient()
    {
        return new OrderServiceClient();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SetterBasedDI.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails();
    }

    


    public static class OrderServiceClient
    {
        private OrderService orderService;
        
        @Autowired
        public void setOrderService (OrderService orderService)
        {
            this.orderService = orderService;
        }


        public void showPendingOrderDetails()
        {
            System.out.println(orderService.getOrderServiceDetail("100"));
        }
    }
}