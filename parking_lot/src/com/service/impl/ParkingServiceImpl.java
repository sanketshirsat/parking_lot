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
        this.map1 = new HashMap<String, Car>();
        this.map2 = new HashMap<String, String>();
       // this.map3 = new HashMap<String, ArrayList<String>>();
        this.map4 = new HashMap<String, Integer>();
        System.out.println("Created parking lot with " + lotCount + " slots");
        System.out.println();
    }
	
	public void park(String regNo) throws Exception
	{
		//System.out.println("In park ...");
        if (this.MAX_SIZE == 0) {
            System.out.println("Sorry, parking lot is not created");
            System.out.println();
        } else if (this.map1.size() == this.MAX_SIZE) {
            System.out.println("Sorry, parking lot is full");
            System.out.println();
        } else {
            Collections.sort(availableSlotList);
            String slot = availableSlotList.get(0).toString();
            Car car = new Car(regNo);
            this.map1.put(slot, car);
            this.map2.put(regNo, slot);
            System.out.println("Allocated slot number: " + slot);
            System.out.println();
            availableSlotList.remove(0);
        }
	}
	
	public void leave(String regNo, String hours) throws Exception
	{
		//initial payment
				int amount=10;
				//System.out.println("In leaving"+regNo);
		    	amount=amount+(Integer.parseInt(hours)-2)*10;
		        if (this.MAX_SIZE == 0) {
		            System.out.println("Sorry, parking lot is not created");
		            System.out.println();
		        } else if (this.map1.size() > 0) {
		        	//System.out.println("else if map1 is greater than zero");
		        	try {
		        	String slotNo = this.map2.get(regNo);
		        	//System.out.println("hmmmmm slot number is  "+slotNo);
		            Car carToLeave = this.map1.get(slotNo);
		            if (carToLeave != null) {
		                this.map1.remove(slotNo);
		                this.map2.remove(carToLeave.getRegNo());
		                this.availableSlotList.add(Integer.parseInt(slotNo));
		                System.out.println("Registration number "+regNo+" with Slot Number "+slotNo+" is free with Charge "+amount);
		                System.out.println();
		            } else {
		                System.out.println("Registration number " + regNo + " not Found");
		                System.out.println();
		            }
		        }
		        	catch (Exception e) {
	                System.out.println(e);
		        		}
		        }
		        	else {
		            System.out.println("Parking lot is empty");
		            System.out.println();
		        }
	}
	
	public void status() throws Exception
	{
		if (this.MAX_SIZE == 0) {
            System.out.println("Sorry, parking lot is not created");
            System.out.println();
        } else if (this.map1.size() > 0) {
            // Print the current status.
            System.out.println("Slot No.\tRegistration No.");
            Car car;
            try {
            for (int i = 1; i <= this.MAX_SIZE; i++) {
                String key = Integer.toString(i);
                if (this.map1.containsKey(key)) {
                    car = this.map1.get(key);
                    System.out.println(i + "\t" + car.getRegNo() );
                   }
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println();
        } else {
            System.out.println("Parking lot is empty");
            System.out.println();
        }
	}
}
