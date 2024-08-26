package com.example.Onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onlinegasbooking.entity.Admin;
@Repository
public interface Adminrepository extends JpaRepository<Admin, String> {
	

}
