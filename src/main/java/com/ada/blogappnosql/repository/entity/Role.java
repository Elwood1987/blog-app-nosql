package com.ada.blogappnosql.repository.entity;


import com.ada.blogappnosql.constants.ERole;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
@Data
public class Role {
    @Id
    private String id;

    private ERole name;

}
