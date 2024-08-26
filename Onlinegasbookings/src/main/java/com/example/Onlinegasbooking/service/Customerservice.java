package com.example.Onlinegasbooking.service;

import com.example.OnlineVechileRentalManagment2.entity.Booking;
import com.example.Onlinegasbooking.entity.Admin;
import com.example.Onlinegasbooking.entity.Customer;
import com.example.Onlinegasbooking.entity.GasBooking;
import com.example.Onlinegasbooking.entity.Surrendercylinder;

public interface Customerservice {
	  public   GasBooking addBooking(int customerId, GasBooking gasBooking) throws Exception;
	  public  Surrendercylinder addSurrenderCylinder(int customerId, Surrendercylinder surrendercylinder) throws Exception;
	  public Customer getcustomer(int customerid) throws Exception;
	  public GasBooking getBooking(int bookingid) throws Exception;
	  public Surrendercylinder getSurrendercylinder(long surrenderId) throws Exception;
	
	
	
	
	    
	}
	 
	
	
	


