package com.project.woodget.category.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.woodget.category.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{
	Optional<Category> findByCateCode(String cateCode);
}
