package com.bean.demo_bean_qualifier;

import com.bean.demo_bean_qualifier.client.OrderServiceClient;
import com.bean.demo_bean_qualifier.service.OrderService;
import com.bean.demo_bean_qualifier.service.impl.OrderServiceImpl1;
import com.bean.demo_bean_qualifier.service.impl.OrderServiceImpl2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppRunner
{
    @Bean(name = "OrderServiceA")
    public OrderService orderServiceByProvider1()
    {
        return new OrderServiceImpl1();
    }

    /**
     * tidak di eksekusi karena tidak didefinisikan
     */
    @Bean(name = "OrderServiceB")
    public OrderService orderServiceByProvider2()
    {
        return new OrderServiceImpl2();
    }

    @Bean
    public OrderServiceClient createClient()
    {
        return new OrderServiceClient();
    }


    public static void main(String[] args) 
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails();
    }    

}
