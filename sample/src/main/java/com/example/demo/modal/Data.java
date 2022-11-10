package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_data")
public class Data {
	
	@Id
	private int orderId;
	private String orderDate;
	private String orderStatus;
	private int collection_of_items;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getCollection_of_items() {
		return collection_of_items;
	}
	public void setCollection_of_items(int collection_of_items) {
		this.collection_of_items = collection_of_items;
	}
	
	
	
}
