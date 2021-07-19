package com.project.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;





@Service
public class SellerService {
	
	static List<Sellers> sellers = new ArrayList<Sellers>(); 
	
	public void saveSeller(Sellers newSeller) {
		
		sellers.add(newSeller);
	}
 
public Sellers findByEmail(String email) {
		
	for(int i = 0; i<= sellers.size(); i++) {
			Sellers account = sellers.get(i);
			
		if(account.getEmail().equals(email)) {
			
			return account;
		}
	    	}
	         return null;
}

     public List <Car> car = new LinkedList<>();
     
     public List<Car> addCar() {
    	 
    	 car.add(new Car("1997", "Ford", "Explorer","87,000","Xm34343","$4,500"));
    	 car.add(new Car("2015", "Honda", "Civic","67,456","3mc78v8989","$7,000"));
    	 car.add(new Car("2010", "BMW", "M3","45,909","4cv89jk90009op","$10,500"));
    	 return car;
     }
     
 	public void saveCar(Car Car) {
		car.add(Car);	
    	 
     }
 	
 	public List<Car> findAll() {
 	
 	return car;
 	}
 	
}


