package org.example.introspringwebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("map")
public class Mapping {

    @GetMapping("hello?")
    public String healthTest1() {
        return "Mapping ok";
    }
    @GetMapping("test/*")
    public String healthTest2() {
        return "Mapping with *";
    }
}
