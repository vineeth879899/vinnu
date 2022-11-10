package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Data;
import com.example.demo.repo.Repositary;

@Service
public class Business {

	@Autowired
	private Repositary repositary;
	
	
	public Data getmethod(Data data) {
		
		 return repositary.save(data);
		
	}
	public List<Data> saveall(List<Data> data){
		return repositary.saveAll(data);
		
	}
	public List<Data> getall(){
		return repositary.findAll();
		
	}
	public Data getorderById(int orderId) {
		return repositary.findById(orderId).orElse(null);
		
	}
	
}
