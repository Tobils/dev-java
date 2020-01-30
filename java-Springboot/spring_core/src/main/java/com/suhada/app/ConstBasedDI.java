package com.suhada.app;

import com.suhada.app.service.OrderService;
import com.suhada.app.service.impl.OrderServiceImpl1;
import com.suhada.app.service.impl.OrderServiceImpl2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstBasedDI 
{

    @Bean 
    public OrderService orderServiceByProvider1()
    {
        return new OrderServiceImpl1();
    }

    @Bean
    public OrderServiceClient createClient()
    {
        return new OrderServiceClient(orderServiceByProvider1());
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConstBasedDI.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails();
    }

    private static class OrderServiceClient
    {
        private OrderService orderService;

        // @Autowired is not needed
        private OrderServiceClient (OrderService orderService) // constructor 
        {
            this.orderService = orderService;
        }

        public void showPendingOrderDetails()
        {
            System.out.println(orderService.getOrderServiceDetail("100"));
        }
    }
}
