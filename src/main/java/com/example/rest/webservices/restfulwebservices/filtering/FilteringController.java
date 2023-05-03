package com.example.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filtering() {
        return new SomeBean("Val1", "Val2", "Val3");
    }

    @GetMapping("filtering-list")
    public List<SomeBean> filteringList() {
        return List.of(new SomeBean("Val1", "Val2", "Val3"), new SomeBean("Val4", "Val5", "Val6"));
    }
}
