package com.project.woodget.category.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.woodget.DataNotFoundException;
import com.project.woodget.category.model.Category;
import com.project.woodget.category.repository.CategoryRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;
	
	public Category getCode(String cateCode) {
		
		Optional<Category> code = this.categoryRepository.findByCateCode(cateCode);
		
		if(code.isPresent()) {
			return code.get();
		} else {
			throw new DataNotFoundException("product not found");
		}
	}
}