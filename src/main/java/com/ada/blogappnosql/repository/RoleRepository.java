package com.ada.blogappnosql.repository;

import com.ada.blogappnosql.constants.ERole;
import com.ada.blogappnosql.repository.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByName(ERole name);
}
