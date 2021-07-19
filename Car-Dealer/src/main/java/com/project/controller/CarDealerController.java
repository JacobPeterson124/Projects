  package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.project.entity.Car;
import com.project.entity.SellerService;
import com.project.entity.Sellers;

@Controller
public class CarDealerController {
	
	@Autowired
	SellerService sellerservice;
	
	
	@GetMapping("/index")
	public String welcome(Model model) {
		
		return "index";
		
	}

	@GetMapping("/sign-up")
	public ModelAndView signup(Model model) {
		
		return new ModelAndView("sign-up", "sellers", new Sellers());
		
	}
	
	@PostMapping("/sign-up")
	public String handleSignUp(Model model, @ModelAttribute("sellers") Sellers sellers, RedirectAttributes redirect) {
		
	    sellerservice.saveSeller(sellers);
		model.addAttribute("newSellers", sellers);
		
		return "redirect:/inventory";
		
	}
	
	@GetMapping ("/login")
	public ModelAndView login (Model model) {
		
		
		return new ModelAndView ("login", "sellers", new Sellers()) ;
		
	}

	@PostMapping ("/login")
	public String authenticate(Model model, @ModelAttribute("sellers") Sellers seller, HttpSession session){
		Sellers account = sellerservice.findByEmail(seller.getEmail());
		if(account.getPassWord().equals(seller.getPassWord())) {
			
			model.addAttribute("sellers",seller);
			return "index";
			
		}else {
			
			model.addAttribute("error", "not so right credentials");
		}
		
		return "login";
	}
	
	@GetMapping("/inventory")
	public ModelAndView addToInventory(Model model) {
		
		return new ModelAndView("inventory", "Car", new Car());
	}
		   
	@PostMapping("/inventory")
	public String handleAddToInventory(Model model, @ModelAttribute("car") Car Car, RedirectAttributes redirect) {
		
		sellerservice.saveCar(Car);
		model.addAttribute("Car", Car);
		
		
		return "redirect:/inventorylist";
		
	}
	
	@GetMapping ("/inventorylist")
	String inventoryList (Model model) {
		
		List<Car> car = sellerservice.findAll();
		model.addAttribute("inventorylist", car);
		

		
		return "inventorylist";
		
	}
	
}
