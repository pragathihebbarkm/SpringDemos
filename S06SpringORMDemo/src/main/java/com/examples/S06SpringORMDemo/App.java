package com.examples.S06SpringORMDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORMDemo.dao.ProductDAO;
import com.examples.S06SpringORMDemo.entity.Product;


public class App 
{
    public static void main( String[] args )
    {
    	
    	//create();
    	//Update();
    	//delete();
    	
    	readOne();
    	
    	readAll();
    	
    }

	private static void readAll() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productDao = (ProductDAO) ctx.getBean("productdao");
		
		List<Product> products = productDao.readAll();
		System.out.println(products);
		
	}

	private static void readOne() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productDao = (ProductDAO) ctx.getBean("productdao");
				
		Product product = productDao.read(2);
		
		System.out.println(product);
		
	}

	private static void delete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productDao = (ProductDAO) ctx.getBean("productdao");
				
       Product product = new Product();
       product.setId(1);
       product.setName("Computer");
       product.setDescription("desktop computer");
       product.setPrice(50000.55);
       
       productDao.delete(product);
       System.out.println("product deleted");
		
	}

	private static void Update() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productDao = (ProductDAO) ctx.getBean("productdao");
				
       Product product = new Product();
       product.setId(1);
       product.setName("Computer");
       product.setDescription("desktop computer");
       product.setPrice(60000.55);
       
       productDao.update(product);
       System.out.println("product updated");
		
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productDao = (ProductDAO) ctx.getBean("productdao");
				
       Product product = new Product();
       product.setId(1);
       product.setName("Computer");
       product.setDescription("desktop computer");
       product.setPrice(60000.55);
       
       int res = productDao.create(product);
       System.out.println("product created:"+res);
	}
}
