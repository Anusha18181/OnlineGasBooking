package com.example.Onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onlinegasbooking.entity.Bank;
@Repository
public interface Bankrepository extends JpaRepository<Bank, Long> {
	

}
