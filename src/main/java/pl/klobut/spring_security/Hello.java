package pl.klobut.spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello!";
    }

    @GetMapping("/hello2")
    public String sayHello2() {
        return "hello2!";
    }
}