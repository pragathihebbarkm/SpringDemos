package com.examples.S02Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        demo1();
    }
    
    private static void demo1() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S02Autowiring/springconfig.xml");
		
		Employee emp1 = (Employee) ctx.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee) ctx.getBean("emp2");
		System.out.println(emp2);
	}
}
