package com.example.demo.controller;

import com.example.demo.dto.Req;
import com.example.demo.dto.UserResponse;
import com.example.demo.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {

    private final RestTemplateService restTemplateService;

    public ApiController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping("/hello")
    public UserResponse getHello(){
        return restTemplateService.hello();
    }

    @PostMapping("/post")
    public Req<UserResponse> postHello(){
        return restTemplateService.genericExchange();
    }
}
