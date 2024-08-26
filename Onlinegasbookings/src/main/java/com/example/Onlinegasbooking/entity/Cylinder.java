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
public class Cylinder {
	@Id
	private long cylinderid;
	private String type;
	private float weight;
	private String strapcolour;
	private float price;
	private String name;
	

}
