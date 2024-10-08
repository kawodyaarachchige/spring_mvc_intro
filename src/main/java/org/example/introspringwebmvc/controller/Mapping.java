package org.example.introspringwebmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

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
    @PostMapping(params = {"name","age"})
    public String helloMapping(@RequestParam("name") String myName,@RequestParam("age") int age) {
        return "request param are: " + myName + " and " + age;
    }
    @PostMapping(headers = {"X-city" ,"X-country"})
    public  String CustomHeader(@RequestHeader("X-city") String city,@RequestHeader("X-country") String country) {
        return "request header is: " + city + " and " + country;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String Consumes(@RequestBody String body) {
        return "request body is: " + body;
    }

}
