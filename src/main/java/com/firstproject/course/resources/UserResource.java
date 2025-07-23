package com.firstproject.course.resources;

import com.firstproject.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "18-9913131-031", "gabriel@gmail.com", "Gabriel", "carlao000");
        return ResponseEntity.ok().body(user);
    }
}
