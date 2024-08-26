package com.example.Onlinegasbooking.service;


import com.example.Onlinegasbooking.entity.Admin;
import com.example.Onlinegasbooking.entity.Customer;
import com.example.Onlinegasbooking.entity.Cylinder;
import com.example.Onlinegasbooking.entity.GasBooking;
import com.example.Onlinegasbooking.entity.Surrendercylinder;

public interface Adminservice {
	public Admin addAdmin( Admin admin);
	public Customer addCustomer(long cylinderId, Customer customer) throws Exception ;
	public Cylinder addCylinder(Cylinder cylinder);
	public GasBooking getBooking(int bookingId) throws Exception;
	public Surrendercylinder getSurrenderCylinder(long scylinderid) throws Exception;
	public Customer getCustomer(int customerId) throws Exception;
	public Customer addCustomer(Customer customer, long cylinderid, long bankid) throws Exception;
	
	
}

