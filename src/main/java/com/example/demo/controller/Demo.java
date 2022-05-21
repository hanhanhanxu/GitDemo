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

    @GetMapping("test4")
    public String test4() {
        return "test4";
    }

    @GetMapping("testxx")
    public String testxx() {
        return "testxx";
    }

    @GetMapping("testqq")
    public String testqq() {
        return "testqq";
    }

    @GetMapping("testee")
    public String testee() {
        return "testee";
    }

}
