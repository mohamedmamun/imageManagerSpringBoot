package com.mamun.imagemanager.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ImageController {

    @PostMapping("/image")
    public String addImage(){
        return "task IMAGE method";
    }
}
