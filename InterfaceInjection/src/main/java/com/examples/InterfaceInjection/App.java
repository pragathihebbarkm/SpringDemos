package com.examples.InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.InterfaceInjection.service.OrderService;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/InterfaceInjection/springconfig.xml");
    	
    	OrderService orderservice = (OrderService) ctx.getBean("orderservice");
    	System.out.println(orderservice);
    }
}
