package com.bezkoder.springbootjpah2.services;

import com.bezkoder.springbootjpah2.models.Role;

import java.util.Set;

public interface IRoleService {

    Set<Role> RolesMap(Set<String> strRoles) throws RuntimeException;
}
