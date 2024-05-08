package com.example.helscorp.stockmanagement.repository;

import com.example.helscorp.stockmanagement.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {
}
