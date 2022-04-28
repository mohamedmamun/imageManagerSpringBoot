package com.mamun.imagemanager.controller;

import com.mamun.imagemanager.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/image")
    public void addImage(@RequestParam("file") MultipartFile file){
        imageService.uploadImage(file);

    }
}
