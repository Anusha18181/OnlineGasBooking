package com.example.Onlinegasbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Onlinegasbooking.entity.Admin;
import com.example.Onlinegasbooking.entity.Customer;
import com.example.Onlinegasbooking.entity.Cylinder;
import com.example.Onlinegasbooking.entity.GasBooking;
import com.example.Onlinegasbooking.entity.Surrendercylinder;
import com.example.Onlinegasbooking.service.Adminservice;

@RestController
public class Admincontroller {
	@Autowired
	private Adminservice adminservice;

	@PostMapping("/addadmin")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
		Admin addAdmin = adminservice.addAdmin(admin);
		return new ResponseEntity<>(addAdmin, HttpStatus.OK);

	}

	@PostMapping("/addcustomer/{cylinderid}")
	public ResponseEntity<Customer> addCustomer(@PathVariable long cylinderid, @RequestBody Customer customer)
			throws Exception {
		Customer addCustomer = adminservice.addCustomer(cylinderid, customer);
		return new ResponseEntity<>(addCustomer, HttpStatus.OK);
	}

	@PostMapping("/addcylinder")
	public ResponseEntity<Cylinder> addCylinder(@RequestBody Cylinder cylinder) {
		Cylinder addCylinder = adminservice.addCylinder(cylinder);
		return new ResponseEntity<>(addCylinder, HttpStatus.OK);

	}

	@GetMapping("(getBooking/{bookingId})")
	ResponseEntity<GasBooking> getBooking(@PathVariable int bookingId) throws Exception {
		GasBooking getBooking = adminservice.getBooking(bookingId);
		return new ResponseEntity<>(getBooking, HttpStatus.ACCEPTED);

	}

	@GetMapping("(getsurrendercylinder/{scylinderid})")
	ResponseEntity<Surrendercylinder> getSurrendercylinder(@PathVariable long scylinderid) throws Exception {
		Surrendercylinder getsurrendercylinder = adminservice.getSurrenderCylinder(scylinderid);
		return new ResponseEntity<>(getsurrendercylinder, HttpStatus.ACCEPTED);

	}

	@GetMapping("(getcustomer/{customerid})")
	ResponseEntity<Customer> getcustomer(@PathVariable int customerid) throws Exception {
		Customer getCustomer = adminservice.getCustomer(customerid);
		return new ResponseEntity<>(getCustomer, HttpStatus.ACCEPTED);

	}
	
	
}
