package com.example.Onlinegasbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Abstractuser {
	@Id
	private long userId;
	private String userName;
	private String password;
	private String address;
	private String phno;
	private String email;
	
	

}
