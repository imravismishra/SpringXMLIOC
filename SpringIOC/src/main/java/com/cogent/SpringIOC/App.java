package com.cogent.SpringIOC;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//        Product product = new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setPrice(23000);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Product product = (Product) context.getBean("product");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getLaptop().getId());
		System.out.println(product.getLaptop().getBrand());
		System.out.println(product.getLaptop().getColors());
		System.out.println(product.getLaptop().getCountry());
		System.out.println(product.getLaptop().getEmployees());
		System.out.println(Arrays.toString(product.getRams()));
		Object[] bm = product.getLaptop().getBodymanu().toArray();
		for (Object obj : bm) {
			System.out.print(((BodyManu) obj).getId() + "   ");
			System.out.println(((BodyManu) obj).getCompany());
		}
	}
}
