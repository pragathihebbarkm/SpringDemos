package com.example.S11SpringBootDataJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootDataJPA.entity.Product;
import com.example.S11SpringBootDataJPA.entity.ProductRepository;

@SpringBootTest
class S11SpringBootDataJpaApplicationTests {

	@Autowired
	ApplicationContext context;
	
	//@Test
	void contextLoads() {
	}

	//@Test
	void createProduct() {
		
		Product product = new Product();
		
		product.setName("Laptop");
		product.setDescription("Dell Inspiron");
		product.setPrice(62000.50);
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		productRepository.save(product);
		
	}
	
	
	//@Test
	void readProduct() {
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productRepository.findById(1);
		
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
		}
		else {
			System.out.println("Product not found in db");
		}
	}
	
	@Test
	void updateProduct() {
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productRepository.findById(4);
		
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
			product.setDescription("Lenovo Thinkpad");
			productRepository.save(product);
		}
		else {
			System.out.println("Product not found in db");
		}
	}
	
	//@Test
	void readAllProducts() {
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findAll();
		
		System.out.println(products);
	}
	
	@Test
	void readAllProductsByName() {
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findByName("HeadSet");
		
		System.out.println(products);
	}
}
