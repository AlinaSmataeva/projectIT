package com.example.demo.services;

import com.example.demo.models.User;

import java.util.Set;

public interface UserService {

    User ConfirmUser(String name, String pas);

    User WithSameName(String name);

    User GetUser(Long id);

    public Long GetUserIdByName(String name);

}
