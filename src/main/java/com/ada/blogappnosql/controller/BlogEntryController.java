package com.ada.blogappnosql.controller;

import com.ada.blogappnosql.repository.entity.BlogEntry;
import com.ada.blogappnosql.service.impl.BlogEntryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog-entries")
public class BlogEntryController {
    private final BlogEntryService blogEntryService;

    public BlogEntryController(BlogEntryService blogEntryService) {
        this.blogEntryService = blogEntryService;
    }

    @GetMapping
    public List<BlogEntry> getAllBlogEntries() {
        return blogEntryService.getAllBlogEntries();
    }


    @PostMapping
    public ResponseEntity<BlogEntry> createBlogEntry(@RequestBody BlogEntry blogEntry) {
        blogEntryService.saveBlogEntry(blogEntry);
        return ResponseEntity.status(HttpStatus.CREATED).body(blogEntry);
    }

}

