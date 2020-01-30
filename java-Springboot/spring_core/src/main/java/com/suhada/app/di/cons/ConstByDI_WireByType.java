package com.suhada.app.di.cons;

import com.suhada.app.service.OrderService;
import com.suhada.app.service.impl.OrderServiceImpl1;
import com.suhada.app.service.impl.OrderServiceImpl2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.suhada.app.di.cons"})
public class ConstByDI_WireByType
{
    @Bean(name="a")
    public OrderService orderServiceProvider1()
    {
        return new OrderServiceImpl1();
    }

    @Bean(name="b")
    public OrderService orderServiceProvider2()
    {
        return new OrderServiceImpl2();
    }


    public static void main(String[] args) 
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConstByDI_WireByType.class);
        OrderServiceClient bean = context.getBean(ConstByDI_WireByType.OrderServiceClient.class);
        bean.showPendingOrderDetails();       
    }

    /**
     * client order service
     */
    @Component
    public static class OrderServiceClient
    {
        private final OrderService orderService1;
        private final OrderService orderService2;

        @Autowired
        OrderServiceClient(@Qualifier("a") OrderService orderService1, @Qualifier("b") OrderService orderService2)
        {
            this.orderService1 = orderService1;
            this.orderService2 = orderService2;
        }

        public void showPendingOrderDetails()
        {
            System.out.println(orderService1.getOrderServiceDetail("100"));
            System.out.println(orderService1.getOrderServiceDetail("200"));
        }

    }

}