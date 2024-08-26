package com.example.Onlinegasbooking.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GasBooking {
	@Id
	
	private int bookingid;
	private LocalDate localDate;
	private boolean status;
	float bill;
	@ManyToOne
	@JsonBackReference
	private Customer customer;
	

}
