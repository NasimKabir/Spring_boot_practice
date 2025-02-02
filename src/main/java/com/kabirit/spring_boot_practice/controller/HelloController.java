package com.kabirit.spring_boot_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nasimkabir
 * @date 29/1/25
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World---sd glsdgj -----------!";
    }
}
