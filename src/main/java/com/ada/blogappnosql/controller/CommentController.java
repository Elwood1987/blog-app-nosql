package com.ada.blogappnosql.controller;

import com.ada.blogappnosql.repository.entity.Comment;
import com.ada.blogappnosql.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }


    @PostMapping
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        commentService.saveComment(comment);
        return ResponseEntity.status(HttpStatus.CREATED).body(comment);
    }
}
