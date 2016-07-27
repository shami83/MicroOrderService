package com.microservice.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class OrderStatus {
	
	private String  orderName;
	private String orderCost;
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(String orderCost) {
		this.orderCost = orderCost;
	}
	
	
	

}
