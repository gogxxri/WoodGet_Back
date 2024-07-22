package com.project.woodget.product.model;

import com.project.woodget.category.model.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="wood_prod")
public class Product {
	
	@Id
	@Column(name="item_code", nullable=false, length=13)
	private String itemCode;
	
	@OneToOne
	@JoinColumn(name="cate_code", referencedColumnName="cate_code", nullable=false)
	private Category category;
	
	@Column(name="prod_name", nullable=false, length=300)
	private String prodName;
	
	@Column(name="prod_des", columnDefinition="TEXT")
	private String prodDes;
	
	@Column(name="price", nullable=false)
	private Integer price;
	
	@Column(name="cnt")
	private Integer cnt;
	
	@Column(name="wood_img1", length=600)
	private String woodImg1;
	
	@Column(name="wood_img2", length=600)
	private String woodImg2;
	
	@Builder.Default
	@Column(name="is_delete_item", nullable=false)
	private Boolean isDeleteItem = false;
}
