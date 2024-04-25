package com.ada.blogappnosql.service.impl;


import com.ada.blogappnosql.repository.CommentRepository;
import com.ada.blogappnosql.repository.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }
}
