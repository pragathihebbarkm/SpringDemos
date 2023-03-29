package com.examples.InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class OrderDaoMySqlImpl implements OrderDao {

	@Override
	public void createOder() {
		System.out.println("open conn");
		System.out.println("run insert statement");
		System.out.println("order created in mysql db");
	}

}
