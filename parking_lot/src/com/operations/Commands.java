package com.operations;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import com.service.ParkingService;
import com.service.impl.ParkingServiceImpl;

public class Commands {

	public Map<String, Method> commandsMap;

    public Commands() {
        commandsMap = new HashMap<String, Method>();
        try {
            populateCommandsHashMap();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void populateCommandsHashMap() throws NoSuchMethodException {
        commandsMap.put("create_parking_lot", ParkingServiceImpl.class.getMethod("createParkingLot", String.class));
        commandsMap.put("park", ParkingServiceImpl.class.getMethod("park", String.class));
        commandsMap.put("leave", ParkingServiceImpl.class.getMethod("leave", String.class, String.class));
        commandsMap.put("status", ParkingServiceImpl.class.getMethod("status"));
      }
}
