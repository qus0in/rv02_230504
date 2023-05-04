package io.playdata.rv02_230504.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.playdata.rv02_230504.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}