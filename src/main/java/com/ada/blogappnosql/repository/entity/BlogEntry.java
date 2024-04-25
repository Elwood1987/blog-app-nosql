package com.ada.blogappnosql.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "blog_entries")
@Data
public class BlogEntry {
    @Id
    private String id;

    private String title;

    private String content;

    @DBRef
    private User author;

    @DBRef
    private List<Comment> comments;

    public BlogEntry(String title, String content, User author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

