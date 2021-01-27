package com.jlopes.hruser.resources;

import com.jlopes.hruser.entities.User;
import com.jlopes.hruser.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/users")
public class UserResource {

    private static Logger logger = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    private UserRepository repository;


    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {

        User user = repository.findById(id).get();
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findById(@RequestParam String email) {

        User user = repository.findByEmail(email);
        return ResponseEntity.ok(user);
    }



}
