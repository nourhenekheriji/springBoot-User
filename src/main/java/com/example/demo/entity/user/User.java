package com.example.demo.entity.user;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import org.hibernate.annotations.Parameter;

import lombok.*;
import lombok.experimental.FieldDefaults;


import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Data
@Entity
@Getter
@Setter
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)



public class User implements Serializable {
	
	@Id
	 
	    @GeneratedValue(strategy = GenerationType.AUTO)
	
	  long id;
	@NonNull
	@Column(columnDefinition = " varchar(20) ",nullable=false)
	  String firstName;
	@NonNull
	@Column(columnDefinition = " varchar(20) ",nullable=false)
	 String lastName;
	@NonNull
	@Column(columnDefinition = " varchar(50) ",nullable=false,unique=true)
	 String email;
	@NonNull
	@Column(columnDefinition = " varchar(255) ",nullable=false)
	 String password;
	@NonNull
	@Column(columnDefinition = " varchar(8) ",nullable=false)
	 String sexe;
	@NonNull
	@Column(columnDefinition = " varchar(8) ",nullable=false)
	 String tel;

	@Lob()
	byte[] picture;
	@Column(columnDefinition="varchar(16)")
	 String createdAt;
	@Column(columnDefinition = " varchar(20) ",nullable=false)
	 String address;
	@Column(columnDefinition = " varchar(25) default 'NOT_VERIFIED'",nullable=false)
	 String accountStatus="NOT_VERIFIED";
	@Column(columnDefinition = " varchar(255) ",nullable=true)
	 String activationToken;
	@Column(columnDefinition = "boolean default false",nullable=false)
	 Boolean twoFactorAuthentication=false;
	@Transient
	String confirmPassword;
	@Transient
	String reCaptcha;
	

	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	
    @OneToMany(mappedBy="user")
    private Set <Quiz> quiz;
	
	

	

	
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
