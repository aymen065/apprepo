package com.bezkoder.springbootjpah2.services.Impl;

import com.bezkoder.springbootjpah2.dataImpl.UserDetailsImpl;
import com.bezkoder.springbootjpah2.models.User;
import com.bezkoder.springbootjpah2.repositories.IUserRepository;
import com.bezkoder.springbootjpah2.services.IUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements IUserDetailsService {

    IUserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }
}
