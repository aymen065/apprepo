package com.bezkoder.springbootjpah2.services;

import com.bezkoder.springbootjpah2.models.User;

public interface IUserService {
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

    void createUser(User user);

}
