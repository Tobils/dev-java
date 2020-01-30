package com.suhada.app;

import com.suhada.app.service.OrderService;
import com.suhada.app.service.impl.OrderServiceImpl1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FieldBasedDI
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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FieldBasedDI.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails();
    }



    private static class OrderServiceClient
    {
        @Autowired
        private OrderService orderService;

        public void showPendingOrderDetails()
        {
            System.out.println(orderService.getOrderServiceDetail("100"));
        }
    }

}