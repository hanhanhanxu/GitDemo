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
        System.out.println("rr");
        return "testqq";
    }

    @GetMapping("testee")
    public String testee() {
        System.out.println("这是aa写的代码");
        //写完代码，commit push之后，准备合并到master(rebase方式)，合并前，检查下master有没有比我们超前的代码，合并进来（所以刚才bb分支的方式是错误的，没有做check master）
        return "testee";
    }

    @GetMapping("testbb")
    public String testbb() {
        //这是bb写的代码
        return "testbb";
    }

    @GetMapping("testlf")
    public String testlf() {
        System.out.println("test");
        //这是lf写的代码
        return "testlf";
    }
}
