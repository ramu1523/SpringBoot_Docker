package com.docker.demo.dockerdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a522467 on 5/16/17.
 */
@RestController
public class DockerDemoRestController {

    @RequestMapping(value="/{value}")
    public String sayHello(@PathVariable("value") String value)
    {
         return "Hello "+value;
    }
}
