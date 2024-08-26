package com.example.Onlinegasbooking.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Surrendercylinder {
	@Id
	private long scylinderid;
	private LocalDate localDate;
	private long cylinderid;
	@ManyToOne
	private Customer customer;
	

}
