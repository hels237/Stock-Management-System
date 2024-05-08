package com.example.helscorp.stockmanagement.repository;

import com.example.helscorp.stockmanagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
