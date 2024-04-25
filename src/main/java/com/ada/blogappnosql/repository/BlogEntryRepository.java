package com.ada.blogappnosql.repository;

import com.ada.blogappnosql.repository.entity.BlogEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogEntryRepository extends MongoRepository<BlogEntry, String> {

}
