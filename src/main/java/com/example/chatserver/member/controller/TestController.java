package com.example.chatserver.member.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @PostMapping("/test")
    public String test(@RequestBody Map<String, Object> body) {
        System.out.println("🔥 /test 컨트롤러 도착");
        return "ok";
    }
}