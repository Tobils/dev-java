package com.javasuhada.restservice.RestApp;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@EnableAsync
public class ParalelSchedulling {
    public static final Logger LOG = LoggerFactory.getLogger(ParalelSchedulling.class);
    @Async
    @Scheduled(fixedDelay = 2000)
    public void fixedDelayExample(){
        LOG.info("Hallo from our fixed delay");
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException ie){
            LOG.error("Got Interrputed !");
        }
    }
}
