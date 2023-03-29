package com.examples.InterfaceInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.examples.InterfaceInjection.dao.OrderDao;

@Component("orderservice")
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Qualifier("orderdaomysql")
	private OrderDao orderdao;
	@Override
	public void placeOrder() {
		
		System.out.println("Perform business logic");
		System.out.println("ready to create order");
		orderdao.createOder();
		
	}

}
