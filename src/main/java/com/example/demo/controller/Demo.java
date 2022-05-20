package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HanXu
 * on 2022/5/20
 * Class description:
 */
@RestController
@RequestMapping
public class Demo {

    @GetMapping("hs")
    public String hs() {
        return "ok";
    }

    @GetMapping("test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("test2")
    public String test2() {
        return "test2";
    }

    @GetMapping("test3")
    public String test3() {
        return "test3";
    }

    @GetMapping("test4")
    public String test4() {
        System.out.println("test4");
        return "test4";
    }
}
