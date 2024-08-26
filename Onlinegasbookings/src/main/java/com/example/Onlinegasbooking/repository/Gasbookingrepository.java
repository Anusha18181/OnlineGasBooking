package com.example.Onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onlinegasbooking.entity.GasBooking;
@Repository
public interface Gasbookingrepository extends JpaRepository<GasBooking, Integer> {

}
