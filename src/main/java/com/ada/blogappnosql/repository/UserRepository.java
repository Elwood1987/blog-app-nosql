package com.ada.blogappnosql.repository;

import com.ada.blogappnosql.repository.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
