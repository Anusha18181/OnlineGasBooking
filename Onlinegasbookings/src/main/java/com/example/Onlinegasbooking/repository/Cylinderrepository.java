package com.example.Onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onlinegasbooking.entity.Cylinder;
@Repository
public interface Cylinderrepository extends JpaRepository<Cylinder, Long> {

}
