package com.codeup.blog.repositories;

import com.codeup.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findById(long id);

//    @Modifying
//    @Query("delete from posts p where p.id = ?1")
    @Transactional
    void deleteById(long id);
}
