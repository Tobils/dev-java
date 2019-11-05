package com.javasuhada.restservice.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// menambahkan log
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloWorld {

    public static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);
    @RequestMapping("/")
    public String index(){
        LOG.info("root request comming up !");
        return "Hello World";
    }

    @RequestMapping("/test")
    public String test(){
        LOG.info("root /test comming up !");
        return "this is test";
    }
}
