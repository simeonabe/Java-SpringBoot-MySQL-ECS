package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserRestController {
 private final UserRepository repo;
 public UserRestController(UserRepository repo){this.repo=repo;}
 @PostMapping public User save(@RequestBody User u){return repo.save(u);}
 @GetMapping public List<User> list(){return repo.findAll();}
}
