package com.example.Onlinegasbooking.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id

	private int customerid;
	private String customername;
	private long customerphonenumber;
	private long userId;
	private String userName;
	private String password;
	private String address;
	private String phno;
	private String email;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	@JsonManagedReference
	private List<GasBooking> gasbooking;
	@OneToMany
	private List<Surrendercylinder> surrendercylinder;
	@OneToOne
	private Cylinder cylinder;
	@OneToOne
	private Bank bank;

}
