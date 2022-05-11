package com.bridgelabz.springbootapp.controller;

import com.bridgelabz.springbootapp.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringBootController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Everyone";
    }

    @RequestMapping(value = {"/hello-w"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello Everyone";
    }

    @GetMapping("/hello/query")
    public String sayPosting(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    @GetMapping("/hello/{firstName}")
    public String sayHello(@PathVariable String firstName) {
        return "Hello " + firstName;
    }

    @PostMapping("/hello/post")
    public String sayPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }
}