package com.project.woodget.order.model;

import java.time.LocalDate;

import com.project.woodget.user.model.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="wood_order")
public class Order {
	
	@Id
	@Column(name="order_code", nullable=false, length=13)
	private String orderCode;
	
	@ManyToOne
	@JoinColumn(name="user_num", referencedColumnName="user_num", nullable=false)
	private User user;
	
	@Column(name="total_price", nullable=false)
	private Integer totalPrice;
	
	@Column(name="rdate")
	private LocalDate rdate;
	
	@Column(name="payment", length=20)
	private String payment;
	
	@Column(name="order_status")
	private Integer orderStatus;
	
	@Column(name="recip_name", nullable=false, length=15)
	private String recipName;
	
	@Column(name="recip_phone", nullable=false)
	private Integer recipPhone;
	
	@Column(name="recip_addr", nullable=false, length=300)
	private String recipAddr;
	
	@Column(name="recip_addr_detail", length=300)
	private String recipAddrDetail;
	
	@Builder.Default
	@Column(name="req", columnDefinition="TEXT")
	private String req = "배달해주셔서 감사합니다.";
	
	@Column(name="total_cnt", nullable=false)
	private Integer totalCnt;
	
	@Column(name="repre_item")
	private Integer repreItem;
	
	@Column(name="repre_img", length=600)
	private String repreImg;
}
	
	
	
