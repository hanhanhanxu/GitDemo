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
}
