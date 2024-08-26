package com.example.Onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onlinegasbooking.entity.Customer;
@Repository
public interface Customerrepository extends JpaRepository<Customer, Integer> {

	

}
