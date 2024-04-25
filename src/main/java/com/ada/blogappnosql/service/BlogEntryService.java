package com.ada.blogappnosql.service;


import com.ada.blogappnosql.repository.BlogEntryRepository;
import com.ada.blogappnosql.repository.entity.BlogEntry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogEntryService {
    private final BlogEntryRepository blogEntryRepository;

    public BlogEntryService(BlogEntryRepository blogEntryRepository) {
        this.blogEntryRepository = blogEntryRepository;
    }

    public List<BlogEntry> getAllBlogEntries() {
        return blogEntryRepository.findAll();
    }

    public void saveBlogEntry(BlogEntry blogEntry) {
        blogEntryRepository.save(blogEntry);
    }

}
