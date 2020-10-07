package com.sapient.project.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Dealer_auth")
public class DealerSignup {
	@Id
	@Column(name = "dealer_userid")
    private String userId;
	@Column(unique=true,nullable=false,name = "dealer_id")
	private Long dealerId;
	@Column(name = "dealer_password")
	private String password;
	@Column(name = "dealer_mail")
	private String mailId;
	@Column(name = "dealer_phn_no")
	private Long phoneNumber;
}
