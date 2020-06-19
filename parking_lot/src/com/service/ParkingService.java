package com.service;

public interface ParkingService {

	public void createParkingLot(String lotCount) throws Exception;
	
	public void park(String regNo) throws Exception;
	
	public void leave(String regNo, String hours) throws Exception;
	
	public void status() throws Exception;
	
	
}
