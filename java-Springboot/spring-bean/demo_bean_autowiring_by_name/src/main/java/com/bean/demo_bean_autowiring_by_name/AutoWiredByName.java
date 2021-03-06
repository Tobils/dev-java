package com.bean.demo_bean_autowiring_by_name;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AutoWiredByName
{
    public static void main(String[] args) 
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ClientBean bean = context.getBean(ClientBean.class);
        bean.doSomething();
        bean.doSomething2();

    }

    @Configuration
    public static class Config 
    {
        @Bean(autowire = Autowire.BY_NAME)
        public ClientBean clientBean()
        {
			return new ClientBean();
        }

        
        @Bean 
        public ServiceBean serviceBean1()
        {
            String msg = "Service bean 1";
            return new ServiceBean(msg);
        }

        @Bean 
        public ServiceBean serviceBean2()
        {
            String msg = "Service bean 2";
            return new ServiceBean(msg);
        }

    }



    private static class ClientBean
    {
        @Autowired
        private ServiceBean serviceBean1;
        public void doSomething()
        {
            System.out.println(serviceBean1.getMsg());
        }

        @Autowired
        private ServiceBean serviceBean2;
        public void doSomething2()
        {
            System.out.println(serviceBean2.getMsg());
        }
    }



    private static class ServiceBean
    {
        private String msg;
        public ServiceBean (String msg)
        {
            this.msg = msg;
        }

        public String getMsg()
        {
            return msg;
        }
    }


}