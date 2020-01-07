package com.example.suhada;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


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
    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue = "wolrd") String name)
    {
        System.out.println("/greeting");
        return new Greeting(String.format(template, name), counter.incrementAndGet());
    }

   @RequestMapping(value="/", method=RequestMethod.GET)
    public SomeData requestMethodName(@RequestParam String param) {
        return new SomeData();
    }
    )
}