package com.mamun.imagemanager;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImageService {

    public void uploadImage(MultipartFile file){
        try {
            byte [] data = file.getBytes();
            Path path = Paths.get("C:\\Users\\mohamed.mamun\\Documents\\imagemanager", file.getOriginalFilename());
            Files.write(path,data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
