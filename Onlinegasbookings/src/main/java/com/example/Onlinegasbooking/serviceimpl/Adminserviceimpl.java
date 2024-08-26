package com.example.Onlinegasbooking.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Onlinegasbooking.entity.Admin;
import com.example.Onlinegasbooking.entity.Bank;
import com.example.Onlinegasbooking.entity.Customer;
import com.example.Onlinegasbooking.entity.Cylinder;
import com.example.Onlinegasbooking.entity.GasBooking;
import com.example.Onlinegasbooking.entity.Surrendercylinder;
import com.example.Onlinegasbooking.repository.Adminrepository;
import com.example.Onlinegasbooking.repository.Bankrepository;
import com.example.Onlinegasbooking.repository.Customerrepository;
import com.example.Onlinegasbooking.repository.Cylinderrepository;
import com.example.Onlinegasbooking.repository.Gasbookingrepository;
import com.example.Onlinegasbooking.repository.Surrendercylinderrepository;
import com.example.Onlinegasbooking.service.Adminservice;
@Service
public class Adminserviceimpl implements Adminservice {
	@Autowired
	private Adminrepository adminrepository;
	@Autowired
	private Cylinderrepository cylinderrepository;
	@Autowired
	private Bankrepository bankrepository;
	@Autowired
	private Customerrepository customerrepository;
	@Autowired
	private Gasbookingrepository bookingrepository;
	@Autowired
	private Surrendercylinderrepository surrendercylinderrepository;

	@Override
	public Admin addAdmin(Admin admin) {
		Admin admin2 = adminrepository.save(admin);
		return admin2;
	}

	@Override
	public Customer addCustomer(long cylinderId, Customer customer) throws Exception {
		Bank bank = bankrepository.save(customer.getBank());
		Cylinder cylinder = cylinderrepository.findById(cylinderId)
				.orElseThrow(() -> new Exception("Cylinder Id is not present..!!!"));
		customer.setCylinder(cylinder);
		customer.setBank(bank);
		return customerrepository.save(customer);
	}

	@Override
	public Cylinder addCylinder(Cylinder cylinder) {
		Cylinder cylinder2 = cylinderrepository.save(cylinder);
		return cylinder2;
	}

	@Override
	public Surrendercylinder getSurrenderCylinder(long cylinderid) throws Exception {
		
		Surrendercylinder surrendercylinder2 = surrendercylinderrepository.findById(cylinderid)
				.orElseThrow(() -> new Exception("Surrendercylinder is not present..!!!"));
		return surrendercylinder2;
	}

	@Override
	public Customer getCustomer(int customerId) throws Exception {
		Customer customer2=customerrepository.findById(customerId).orElseThrow(() -> new Exception("Customer Id is not present..!!!"));
		return customer2;
	}

	@Override
	public GasBooking getBooking(int bookingId) throws Exception {
	GasBooking booking=bookingrepository.findById(bookingId).orElseThrow(() -> new Exception("Booking Id is not present..!!!"));
		return booking;
	}

	@Override
	public Customer addCustomer(Customer customer, long cylinderid, long bankid) throws Exception {
		Cylinder cylinder = cylinderrepository.findById(cylinderid)
				.orElseThrow(() -> new Exception("Cylinder Id is not present..!!!"));
		Bank bank = bankrepository.findById(bankid).orElseThrow(() -> new Exception("Bank Id is not present..!!!"));
		customer.setCylinder(cylinder);
		customer.setBank(bank);
		return customerrepository.save(customer);
	}

}
