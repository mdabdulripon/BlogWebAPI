package com.alligator.blog.Repositories;

import com.alligator.blog.Entities.BlogPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPostEntity, Long> {
    BlogPostEntity findBlogPostById(Long id);
    BlogPostEntity findBlogPostsByMerchantName(String merchantName);
    BlogPostEntity findBlogPostsByUserId(String userId);
}