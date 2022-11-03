package com.web.server;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    UserRepo repo;

    public UserController(UserRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/users")
    public List<UserEntity> getAll(){
        return this.repo.findAll();
    }

    @PostMapping("/users")
    public UserEntity postOne(@RequestBody UsersDTO user){
        UserEntity target = new UserEntity();

        target.setName(user.getName());
        target.setAge(user.getAge());

        return repo.save(target);
    }
}
