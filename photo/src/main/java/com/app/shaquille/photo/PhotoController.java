package com.app.shaquille.photo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController
public class PhotoController {

    private Map<String, Photo> db = new HashMap<>(){{
        put("1", new Photo("1","hello.jpg"));
    }};

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/photo")
    public List<Photo> Get() {
        return new ArrayList<>(db.values());
    }

    @GetMapping("/photo/{id}")
    public Photo getPhotos(@PathVariable String id) {
       Photo photo = db.get(id);
       if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
       return photo;
    }
    @DeleteMapping("/photo/{id}")
    public void delete(@PathVariable String id) {
        Photo photo = db.remove(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/photo/{id}")
    public Photo create(Photo photo) {
        photo.setId(UUID.randomUUID().toString());
        db.put(photo.getId(), photo);
        return photo;
    }

}
