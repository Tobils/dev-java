package com.example.suhada;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController
{
    private static final String template = "Hello,  %s";
    private final AtomicLong counter = new AtomicLong();

    /**
     * routes for /greeting
     * @param param
     * @return
     */
    @GetMapping(path = "/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "world") String name)
    {
        System.out.println("/greeting");
        return new Greeting(String.format(template, name), counter.incrementAndGet());
    }

    @GetMapping(path = "/")
    public Root root()
    {
        return new Root(counter.incrementAndGet());
    }
}