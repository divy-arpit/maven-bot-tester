package com.example.bot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  controller {
    brain brain=new brain();
    @GetMapping("/isvalid/{id}")
    public apiresp isValid(@PathVariable String id){
        return brain.getData();
    }

}