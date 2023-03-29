package com.examples.S03Stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.examples.beans.S03Stereotypes.Instructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        demo1();
    }
    
 private static void demo1() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S03Stereotypes/springconfig.xml");
		
		Instructor instructor = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor);
		
	}
}
