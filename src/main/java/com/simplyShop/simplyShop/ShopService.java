package com.simplyShop.simplyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
	
	@Autowired
	ShopRepository shopRepository;
	
	public void createInitialData() {
		
		//Products
		Product p1= new Product(1234500001L,"Cable USB 5m",20);
		shopRepository.save(p1);
		Product p2= new Product(1234500002L,"Asus MotherBoard gtx3",64);
		shopRepository.save(p2);
		Product p3= new Product(1234500003L,"Sound Card SBpro",25);
		shopRepository.save(p3);
		Product p4= new Product(1234500004L,"Nvidia GTX1050",165);
		shopRepository.save(p4);
		Product p5= new Product(1234500005L,"RAM DDR4 8GBx2",76);
		shopRepository.save(p5);
		Product p6= new Product(1234500006L,"Ryzen processor top",345);
		shopRepository.save(p6);
		Product p7= new Product(1234500007L,"CPU Fan Silent",37);
		shopRepository.save(p7);
		Product p8= new Product(1234500008L,"CPU Powersource 770W",132);
		shopRepository.save(p8);
		
	}
	
	
	
	
	
	
	public Iterable<Product> getWholeList() {
		
		Iterable<Product> products = shopRepository.findAll();
		
		return products;
		
	}

}
