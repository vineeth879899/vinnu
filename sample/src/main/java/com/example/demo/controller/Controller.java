package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Business;
import com.example.demo.modal.Data;

@RestController

public class Controller {
	
	@Autowired
	private Business business;
	
	@PostMapping("/order")
	public Data add(@RequestBody Data data) {
		return business.getmethod(data);
		
	}
	@PostMapping("/ordersaveAll")
	public List<Data> savaAll(@RequestBody List<Data> data) {
		return business.saveall(data);
		
		
	}
	
	@GetMapping("/orderfindAll")
	public List<Data> findall(){
		return business.getall();
	}
	
	@GetMapping("/findById/{orderId}")
	public Data findbyId(@PathVariable int orderId) {
		return business.getorderById(orderId);
	}

}
