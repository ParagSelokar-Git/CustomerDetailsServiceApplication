package com.confonet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.confonet.repository.CrzAgendaDetailsRepository;
import com.confonet.response.ResponseHandler;

@Service
public class CustDetailsService {
	
	@Autowired
	private CrzAgendaDetailsRepository crzAgendaDetailsRepository;
	

	public ResponseEntity<Object> getCustomer(Integer id) {
		return ResponseHandler.generateResponse("getcrzAgendaDetailsRepository Remarks", HttpStatus.OK, null,
				crzAgendaDetailsRepository.findById(id));
	}

	
}
