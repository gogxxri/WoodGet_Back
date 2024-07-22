package com.project.woodget.category.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="wood_category")
public class Category {
	
	@Id
	@Column(name="cate_code", nullable=false, length=16)
	private String cateCode;
	
	@Column(name="cate_name", nullable=false, length=30)
	private String cateName;
}
