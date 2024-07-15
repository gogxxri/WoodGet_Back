package com.project.woodget.deliver.model;

import com.project.woodget.address.model.Address;
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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="wood_deliver")
public class Deliver {
	
	@Id
	@Column(name="deli_code", nullable=false, length=16)
	private String deliCode;
	
	@ManyToOne
	@JoinColumn(name="user_addr_num", referencedColumnName="user_addr_num", nullable=false)
	private Address address; 
	
	@ManyToOne
	@JoinColumn(name="user_num", referencedColumnName="user_num", nullable=false)
	private User user;
	
	@Column(name="recipient_name", nullable=false, length=20)
	private String recipientName;
	
	@Column(name="recipient_phone", nullable=false, length=11)
	private String recipientPhone;
	
	@Column(name="req", columnDefinition="TEXT")
	private String req;

}
