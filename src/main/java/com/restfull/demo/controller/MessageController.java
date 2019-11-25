package com.restfull.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculate")
public class MessageController {
    @GetMapping("increment")
    public int increment (@RequestHeader int a, @RequestHeader int b){
        return a+b;
    }

    @GetMapping("decrement")
    public int decrement (@RequestHeader int a, @RequestHeader int b){
        return a-b;
    }

    @GetMapping("Multiplication")
    public int aa (@RequestHeader int a,@RequestHeader int b){
        return a*b;
    }

    @GetMapping("Division")
    public float devision (@RequestHeader int a, @RequestHeader int b){
        return a/b;
    }


}
