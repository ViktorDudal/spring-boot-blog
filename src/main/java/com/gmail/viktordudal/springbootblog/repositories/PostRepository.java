package com.gmail.viktordudal.springbootblog.repositories;

import com.gmail.viktordudal.springbootblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
