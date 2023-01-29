package com.springxmlrequest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springxmlrequest.service.DataService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ApiController {

	private final DataService dataService;

	@GetMapping
	public ResponseEntity<Object> getData() {
		var response = this.dataService.getData();
		return ResponseEntity.ok(response);
	}
}
