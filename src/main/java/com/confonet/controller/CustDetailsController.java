package com.confonet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.confonet.service.CustDetailsService;

@RestController
@RequestMapping("/customer")
public class CustDetailsController {

	@Autowired
	private CustDetailsService custDetailsService;
	
	@GetMapping("/getCust")
	public ResponseEntity<Object> getCustomer(@RequestParam Integer id) {
		return custDetailsService.getCustomer(id);
	}
	
}
