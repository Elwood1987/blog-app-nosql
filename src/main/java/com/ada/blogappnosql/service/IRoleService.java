package com.ada.blogappnosql.service;

import com.ada.blogappnosql.repository.entity.Role;

import java.util.List;

public interface IRoleService {
    void save(Role role);
    List<Role> getAllRoles();
}
