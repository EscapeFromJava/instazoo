package com.example.instazoo.repository;

import com.example.instazoo.entity.Post;
import com.example.instazoo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByUserOrderByCreatedDateDesc(User user);

    List<Post> findAllByOOrderByCreatedDateDesc();

    Optional<Post> findPostByIdAndUser(Long postId, User user);

}
