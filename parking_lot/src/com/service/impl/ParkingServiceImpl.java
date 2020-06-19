package com.service.impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.pojo.Car;
import com.service.ParkingService;


public class ParkingServiceImpl implements ParkingService
{
	int MAX_SIZE = 0;
 // Available slots list
    ArrayList<Integer> availableSlotList;
    // Map of Slot, Car
    Map<String, Car> map1;
    // Map of RegNo, Slot
    Map<String, String> map2;
    // Map of Color, List of RegNo
    Map<String, ArrayList<String>> map3;
    // Map of 
    Map<String,Integer> map4;
	

    public void createParkingLot(String lotCount)
    {
    	try {
            this.MAX_SIZE = Integer.parseInt(lotCount);
        } catch (Exception e) {
            System.out.println("Invalid lot count");
            System.out.println();
        }
        this.availableSlotList = new ArrayList <Integer>() {};
        for (int i=1; i<= this.MAX_SIZE; i++) {
            availableSlotList.add(i);
        }
        
        System.out.println("Created parking lot with " + lotCount + " slots");
        System.out.println();
    }
	
	public void park(String regNo) throws Exception
	{
	}
	
	public void leave(String regNo, String hours) throws Exception
	{
		
	}
	
	public void status() throws Exception
	{
		
    }
}
