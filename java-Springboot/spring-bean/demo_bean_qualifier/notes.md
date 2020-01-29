# Mathcing Bean by Qualifier

- output
    ```java
    22:21:40.004 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@37374a5e
    22:21:40.056 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
    22:21:40.485 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
    22:21:40.491 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
    22:21:40.497 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
    22:21:40.502 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
    22:21:40.529 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'appRunner'
    22:21:40.551 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'OrderServiceA'
    22:21:40.589 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'OrderServiceB'
    22:21:40.592 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'createClient'
    order details from impl 1, for order id 100
    order details from impl 1, for order id 200
    order details from impl 1, for order id 300
    ```
- pemabahasan

    ```java
    @Bean(name = "OrderServiceA")
    ```
    ```
    syntax diatas digunakan oleh bean untuk membedakan setiap service yang masuk pada class OrderServiceClient.
    sehingga hanya @Qualifier("OrderServiceA") yang diolah lebih lanjut. sedangkan @Qualifier("OrderServiceB"),
    tidak di eksekusi lebih lanjut karena tidak didefinisikan di OrderServiceClient.
    ```
