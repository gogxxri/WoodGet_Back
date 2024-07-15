package com.project.woodget.user.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
@Table(name="wood_cus")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_num")
	private Integer userNum;
	
	@Column(name="email", nullable=false, length=100)
	private String email;
	
	@Column(name="username", nullable=false, length=100)
	private String username;
	
	@Column(name="nickname", nullable=false, length=20)
	private String nickname;
	
	@Column(name="password", nullable=false, length=64)
	private String password;
	
	@Column(name="user_birth", nullable=false)
	private Integer birthYear;
	
	@Column(name="gender", nullable=false, length=1)
	private String gender;
	
	@Column(name="is_withdraw", nullable=false)
	private Boolean isWithdraw;
	
	@Temporal(TemporalType.DATE)
	@Column(name="signup_date", nullable=true)
	private LocalDate signupDate;
}
