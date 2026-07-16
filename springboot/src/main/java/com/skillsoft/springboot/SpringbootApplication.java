package com.skillsoft.springboot;

import com.skillsoft.springboot.model.Product;
import com.skillsoft.springboot.repository.ProductRepository;
import com.skillsoft.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product("Television","Electronics"));
		productRepository.save(new Product("Air Conditioner","Electronics"));
		productRepository.save(new Product("Sofa","Furniture"));
		productRepository.save(new Product("Cushions","Home Essentials"));
		productRepository.save(new Product("Wardrobe","Furniture"));
	}


}
