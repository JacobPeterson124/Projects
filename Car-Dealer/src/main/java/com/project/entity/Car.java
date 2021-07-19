package com.project.entity;

public class Car {
	
	String year;
	String make;
	String model;
	String mileage;
	String vinNum;
	String price;
	
	
	
	public Car(String string, String string2, String string3, String string4, String string5, String string6) {
		
	}
	public Car() {
		
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getVinNum() {
		return vinNum;
	}
	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void add(Car car) {
		
		
	}
	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + ", mileage=" + mileage + ", vinNum="
				+ vinNum + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
