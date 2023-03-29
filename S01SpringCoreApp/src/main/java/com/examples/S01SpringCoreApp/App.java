package com.examples.S01SpringCoreApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        demo1();
        //demo2();
        //demo3();
        //demo4();
        
    }

	private static void demo4() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01SpringCoreApp/springconfig4.xml");
		
		EmployeeDAO dao = (EmployeeDAO) ctx.getBean("empdao");
		System.out.println(dao);
		
	}

	private static void demo3() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01SpringCoreApp/springconfig3.xml");
		
		Computer c1 = (Computer) ctx.getBean("homecomputer");
		System.out.println(c1);
		
		Computer c2 = (Computer) ctx.getBean("officecomputer");
		System.out.println(c2);
		
	}

	private static void demo1() {
		//create a spring container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01SpringCoreApp/springconfig.xml");
        
        //ask the container for employee bean
        Employee emp1 = (Employee) ctx.getBean("emp1");
        System.out.println(emp1);
        
        Employee emp2 = (Employee) ctx.getBean("emp2");
        System.out.println(emp2);
        
        Employee e3 = (Employee) ctx.getBean("emp3");
        System.out.println(e3);
        
        Employee e4 = (Employee) ctx.getBean("emp4");
        System.out.println(e4);	
        
        Employee e5 = (Employee) ctx.getBean("emp5");
        System.out.println(e5);	

        Employee e6 = (Employee) ctx.getBean("emp6");
        System.out.println(e6);	
        
        Employee e7 = (Employee) ctx.getBean("emp7");
        System.out.println(e7);
	}
	
	private static void demo2() {
		//create a spring container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01SpringCoreApp/springconfig2.xml");
        
        Car c1 = (Car) ctx.getBean("car");
        System.out.println(c1.hashCode());
        
        Car c2 = (Car) ctx.getBean("car");
        System.out.println(c2.hashCode());
        
        Object b1 = ctx.getBean("bank");
        System.out.println(b1.hashCode());
        
        Object b2 = ctx.getBean("bank");
        System.out.println(b2.hashCode());
	}
}

