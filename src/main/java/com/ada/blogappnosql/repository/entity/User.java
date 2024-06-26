package com.ada.blogappnosql.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "users")
@Data
public class User {
    @Id
    private String id;

    private String username;

    private String email;

    private String password;

    private boolean enabled;

    @DBRef
    private Set<Role> roles = new HashSet<>();
    // Getters y setters
}
