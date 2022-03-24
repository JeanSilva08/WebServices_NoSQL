package com.lostline.webservices_nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lostline.webservices_nosql.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
