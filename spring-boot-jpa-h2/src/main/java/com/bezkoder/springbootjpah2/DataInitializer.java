package com.bezkoder.springbootjpah2;

import com.bezkoder.springbootjpah2.models.ERole;
import com.bezkoder.springbootjpah2.models.Role;
import com.bezkoder.springbootjpah2.repositories.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final IRoleRepository roleRepository;

    @Autowired
    public DataInitializer(IRoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {
        roleRepository.save(new Role(ERole.ROLE_USER));
        roleRepository.save(new Role(ERole.ROLE_MODERATOR));
        roleRepository.save(new Role(ERole.ROLE_ADMIN));
    }
}