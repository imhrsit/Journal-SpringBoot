package com.journal.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("abc")
    public String sayHello(){
         return "Hey! My name is Journal.";
    }
}
