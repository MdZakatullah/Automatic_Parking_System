package com.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aps.entity.BookingDtls;
import com.aps.entity.PaymentDtls;
import com.aps.entity.UserDtls;
import com.aps.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/registration_user")
	public String registration_user() {
		return "registration_user";
	}
	
	@GetMapping("/login_user")
	public String login_user() {
		return "login_user";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute UserDtls u, HttpSession session) {
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully..");
		
		return "redirect:/login_user";
	}
	
	@Autowired
	private UserRepository repo;
	
	
	@GetMapping("/booking")
	public String booking() {
		return "booking";
	}
	
	@PostMapping("/loginUser")
	public String loginUser(@ModelAttribute UserDtls u, HttpSession session) {
		repo.save(u);
		return "redirect:/booking";
	}
	
	
	@GetMapping("/booking_user")
	public String booking_user() {
		return "booking_user";
	}
	
	@PostMapping("/bookUserSlot")
	public String bookUserSlot(@ModelAttribute BookingDtls b, HttpSession session) {
		System.out.println(b);
		
		repo.save(b);
		session.setAttribute("message", "Slot booked Successfully.. Now enjoy your day :)");
		
		return "redirect:/payment";
	}
	
	@GetMapping("/successfully_booked")
	public String successfully_booked() {
		return "successfully_booked";
	}
	
	@GetMapping("/payment")
	public String payment() {
		return "payment";
	}
	
	@PostMapping("/paymentGateway")
	public String paymentGateway(@ModelAttribute PaymentDtls p, HttpSession session) {
		System.out.println(p);
		
		repo.save(p);
		session.setAttribute("message", "Payment Successfully");
		
		return "redirect:/successfully_booked";
	}
	
	

}
