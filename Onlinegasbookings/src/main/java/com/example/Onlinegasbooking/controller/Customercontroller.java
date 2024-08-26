package com.example.Onlinegasbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Onlinegasbooking.entity.Customer;
import com.example.Onlinegasbooking.entity.GasBooking;
import com.example.Onlinegasbooking.entity.Surrendercylinder;
import com.example.Onlinegasbooking.service.Customerservice;

@RestController
public class Customercontroller {
	@Autowired
	private Customerservice customerservice;

	@PostMapping("/addBooking/{customerId}")
	public ResponseEntity<GasBooking> addBooking(@PathVariable int customerId, @RequestBody GasBooking booking)
			throws Exception {
		GasBooking addbooking = customerservice.addBooking(customerId, booking);
		return new ResponseEntity<>(addbooking, HttpStatus.OK);
	}

	@PostMapping("/addSurrendercylinder/{customerid}")
	public ResponseEntity<Surrendercylinder> addSurrendercylinder(@PathVariable int customerid,
			@RequestBody Surrendercylinder surrendercylinder) throws Exception {
		Surrendercylinder addsurrendercylinder = customerservice.addSurrenderCylinder(customerid, surrendercylinder);
		return new ResponseEntity<Surrendercylinder>(addsurrendercylinder, HttpStatus.OK);

	}

	@GetMapping("/getCustomer/{customerid}")
	ResponseEntity<Customer> getCustomer(@PathVariable int customerid) throws Exception {
		Customer getCustomer = customerservice.getcustomer(customerid);
		return new ResponseEntity<>(getCustomer, HttpStatus.ACCEPTED);
	}

	@GetMapping("/getBooking/{Bookingid}")
	ResponseEntity<GasBooking> getBooking(@PathVariable int Bookingid) throws Exception {
		GasBooking getBooking = customerservice.getBooking(Bookingid);
		return new ResponseEntity<>(getBooking, HttpStatus.ACCEPTED);
	}
@GetMapping("/getSurrendercylinder/{Bookingid}")
	ResponseEntity<Surrendercylinder> getSurrendercylinder(@PathVariable long scylinderid) throws Exception {
		Surrendercylinder getSurrendercylinder = customerservice.getSurrendercylinder(scylinderid);
		return new ResponseEntity<>(getSurrendercylinder, HttpStatus.ACCEPTED);

	}
}
