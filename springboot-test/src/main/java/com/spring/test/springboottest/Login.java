package com.spring.test.springboottest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @RequestMapping("/login")
    public void login() {
        System.out.println("Login");
    }
}
