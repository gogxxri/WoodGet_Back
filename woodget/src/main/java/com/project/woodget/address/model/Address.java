package com.project.woodget.address.model;

import com.project.woodget.user.model.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="wood_user_addr")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_addr_num")
	private Integer userAddrNum;
	
	@ManyToOne
	@JoinColumn(name="user_num", referencedColumnName="user_num", nullable=false)
	private User user;
	
	@Column(name="street_addr", nullable=false, length=100)
	private String streetAddr;
	
	@Column(name="addr_detail", length=100)
	private String addrDetail;
	
	@Column(name="zipcode", nullable=false, length=10)
	private String zipcode;
	
	@Column(name="region")
	private Integer region;
	
	@Column(name="default_addr", nullable=false)
	private Boolean defaultAddr;
}
