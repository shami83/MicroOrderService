package com.microservice.order;


	
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.microservice.model.OrderStatus;

	@Path("/order")
	public class OrderService {
		
		@GET
		@Path("{name}")
		@Produces(MediaType.TEXT_XML)
		public OrderStatus getOrderStatus(@PathParam("name")String name)
		{
			System.out.println("Orderd Item name is ==>" + name);
			OrderStatus status = new OrderStatus();
			status.setOrderName(name);
			status.setOrderCost("90");
			return status;
		}

	}



