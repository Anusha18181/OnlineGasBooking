package com.example.Onlinegasbooking.serviceimpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Onlinegasbooking.entity.Customer;
import com.example.Onlinegasbooking.entity.GasBooking;
import com.example.Onlinegasbooking.entity.Surrendercylinder;
import com.example.Onlinegasbooking.repository.Customerrepository;
import com.example.Onlinegasbooking.repository.Gasbookingrepository;
import com.example.Onlinegasbooking.repository.Surrendercylinderrepository;
import com.example.Onlinegasbooking.service.Customerservice;
@Service
public class Customerserviceimpl implements Customerservice {
	@Autowired
	private Customerrepository customerepository;
	@Autowired
	private Gasbookingrepository bookingrepository;
	@Autowired
	private Surrendercylinderrepository surrendercylinderrepository;

	@Override
	public GasBooking addBooking(int customerId, GasBooking gasBooking) throws Exception {
		Customer customer = customerepository.findById(customerId)
				.orElseThrow(() -> new Exception("Customer Id is not present..!!!"));
		gasBooking.setCustomer(customer);
		gasBooking.setLocalDate(LocalDate.now());
		 return bookingrepository.save(gasBooking);

	}

	@Override
	public Surrendercylinder addSurrenderCylinder(int customerId, Surrendercylinder surrendercylinder) throws Exception {
		Customer customer=customerepository.findById(customerId).orElseThrow(() -> new Exception("Customer Id is not present..!!!"));
		surrendercylinder.setCustomer(customer);
		surrendercylinder.setCylinderid(customerId);
		surrendercylinder.setLocalDate(LocalDate.now());
		return surrendercylinderrepository.save(surrendercylinder);
	}

	@Override
	public Customer getcustomer(int customerid) throws Exception {
		Customer customer=customerepository.findById(customerid).orElseThrow(() -> new Exception("Customer Id is not present..!!!"));
		return customer;
	}

	@Override
	public GasBooking getBooking(int bookingid) throws Exception {
		GasBooking booking=bookingrepository.findById(bookingid).orElseThrow(() -> new Exception("Booking Id is not present..!!!"));
		return booking;
	}

	@Override
	public Surrendercylinder getSurrendercylinder(long surrenderId) throws Exception {
		Surrendercylinder surrendercylinder = surrendercylinderrepository.findById(surrenderId).orElseThrow(() -> new Exception("Booking Id is not present..!!!"));
		return surrendercylinder ;
	}

}
