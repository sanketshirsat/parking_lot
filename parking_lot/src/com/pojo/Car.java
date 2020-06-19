package com.pojo;

public class Car {

	String regNo;
    String color;
    // Constructor with 2 para
    public Car(String regNo, String color) {
        this.regNo = regNo;
        this.color = color;
    }
 // Constructor with 1 para
    public Car(String regNo) {
        this.regNo = regNo;
        
    }
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + "]";
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
