package org.example.introspringwebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class Demo  {
    @GetMapping
    public String healthTest() {
        return "OK";
    }
    @PostMapping
    public String healthTest2() {
        return "OK POST";
    }
    @PostMapping("post")
    public String healthTest3() {
        return "OK POST 2";
    }

}
