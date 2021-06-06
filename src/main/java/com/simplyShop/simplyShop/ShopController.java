package com.simplyShop.simplyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Shop")
public class ShopController {
	
	@Autowired
	ShopService shopService;
	
	@RequestMapping("/Ini")
	public String createBD() {
		return "iniOK";
	}
	
	//To show the whole list of products
	@RequestMapping("/all")
	public String showWholeList(Model box) {
			
			//with object model "box" and the tab "boxedproducts" we send the list to the web 
			box.addAttribute("boxedCountries", shopService.getWholeList());
			// go to the template
			return "productList";
		}

}
