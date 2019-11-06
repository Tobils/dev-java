package com.javasuhada.restservice.RestApp;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

@Component
public class SayHelloTask {
    private static final Logger LOG = LoggerFactory.getLogger(SayHelloTask.class);
    @Scheduled(fixedRate = 1000)
    public void sayHello(){
        LOG.info("assalamualaikum from fixedRate method");
    }

    @Scheduled(fixedDelay = 1000)
    public void fixedDelayExample(){
        LOG.info("assalamualaikum from fixed delay method");
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException ie){
            LOG.error("Got Interrupted !");
        }
    }

    @Scheduled(cron = "*/2 * * * * ?") // do every 2 seconds
    public void cronTaskExample(){
        LOG.info("this is how chrone can be used !");
    }
}
