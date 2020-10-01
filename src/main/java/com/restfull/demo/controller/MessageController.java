package com.restfull.demo.controller;

import com.restfull.demo.models.ResponseB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Controller
//@RequestMapping("calculate")
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

    @RequestMapping("/plus")
    @ResponseBody
    public ResponseB aaa (@RequestParam(value = "a", required = true)int a,
                          @RequestParam(value = "b", required = true)int b){
        return new ResponseB(a+b);
    }

}
