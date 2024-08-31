package org.example.introspringwebmvc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("map")
public class Mapping {

    @GetMapping("hello?")//placeholder for one character
    public String healthTest() {
        return "Mapping ok";
    }
    @GetMapping("hello??")//placeholder for two character
    public String healthTest1() {
        return "Mapping ok test 1";
    }

    @GetMapping("test/*") //placeholdr for single path segment
    public String healthTest2() {
        return "Mapping with *";
    }

    @GetMapping("test/**") //placeholdr for multiple path segment like spring wildcard
    public String healthTest3() {
        return "Mapping with **";
    }
    @PostMapping("/{name}/{id}") //path variable
    public String healthTest4(@PathVariable("name") String name,@PathVariable("id") int id) {
        return "Path  variable are: " + name + " and " + id;
    }
    @PostMapping("/{id:S\\d{4}}") //path variable with regex
    public String healthTest5(@PathVariable("id") String id) {
        return "Path variable is : " + id;
    }

}
