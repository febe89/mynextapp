package com.codewithquad.next.service;

import com.codewithquad.next.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getUsers();

    User getUserById(Long id);

    boolean deleteUserById(Long id);

    User updateUser(Long id, User user);
}
