package com.studio.users.controller;


import com.studio.users.controller.json.UserJson;
import com.studio.users.domain.User;
import com.studio.users.entity.UserDocument;
import com.studio.users.repository.IUserMongoRepository;
import com.studio.users.usecase.CreateUser;
import com.studio.users.usecase.DeleteUser;
import com.studio.users.usecase.FindAllUser;
import com.studio.users.usecase.FindOneUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    CreateUser createUser;
    @Autowired
    FindAllUser findAllUser;
    @Autowired
    FindOneUser findOneUser;
    @Autowired
    DeleteUser deleteUser;

    @PostMapping(value = "users")
    public void create(@RequestBody UserJson userJson){
        createUser.execute(userJson.toEntity());
    }

    @GetMapping(value = "users")
    public List<UserJson> findAll() {
        List<User> users = findAllUser.execute();
        return users.stream().map(user -> UserJson.toJson(user))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "users/{id}")
    public User findOne(@PathVariable("id") String id) {

        return findOneUser.execute(id);
    }

    @DeleteMapping(value = "users/{id}")
    public void delete(@PathVariable("id") String id) {
         deleteUser.execute(id);
    }
}
