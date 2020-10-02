package com.restfull.demo.controller;

import com.restfull.demo.database.CreateTable;
import com.restfull.demo.models.ResponseB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Controller
//@RequestMapping("calculate")
public class MessageController {

    CreateTable createTable = new CreateTable();

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

    @RequestMapping("/registration")
    @ResponseBody
    public ResponseB aaa (@RequestParam(value = "email", required = true)String email,
                          @RequestParam(value = "password", required = true)String password){
        createTable.connectDataBase(email, password);
        return new ResponseB(1);
    }

}
