package com.ada.blogappnosql.service.impl;

import com.ada.blogappnosql.repository.RoleRepository;
import com.ada.blogappnosql.repository.entity.Role;
import com.ada.blogappnosql.service.IRoleService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleService implements IRoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
