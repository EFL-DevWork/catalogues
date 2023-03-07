package com.cart.cartCatalogues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

import static java.lang.System.getenv;

@SpringBootApplication
public class CartCataloguesApplication {

	public static void main(String[] args) {

		SpringApplication springApplication=new SpringApplication(CartCataloguesApplication.class);

		var username= getenv("mysql_username");
		var password= getenv("mysql_password");
		Properties properties=new Properties();
		properties.put("spring.datasource.username",username);
		properties.put("spring.datasource.password",password);
		springApplication.setDefaultProperties(properties);
		springApplication.run(args);
	}

}
