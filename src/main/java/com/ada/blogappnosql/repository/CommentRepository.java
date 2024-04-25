package com.ada.blogappnosql.repository;


import com.ada.blogappnosql.repository.entity.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
    // Puedes agregar métodos personalizados aquí si es necesario
}

