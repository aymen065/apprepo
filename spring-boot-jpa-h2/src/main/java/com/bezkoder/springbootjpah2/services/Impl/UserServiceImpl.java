package com.bezkoder.springbootjpah2.services.Impl;

import com.bezkoder.springbootjpah2.models.User;
import com.bezkoder.springbootjpah2.repositories.IUserRepository;
import com.bezkoder.springbootjpah2.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {
    IUserRepository userRepository;
    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
}
