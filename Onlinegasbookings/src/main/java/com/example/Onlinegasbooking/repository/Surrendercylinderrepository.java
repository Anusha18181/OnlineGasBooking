package com.example.Onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onlinegasbooking.entity.Surrendercylinder;
@Repository
public interface Surrendercylinderrepository extends JpaRepository<Surrendercylinder, Long>{

}
