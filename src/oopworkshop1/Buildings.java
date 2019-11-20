package oopworkshop1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Buildings implements IBuildingManagementSystem {
    
    ArrayList<Buildings> buildingList = new ArrayList<>();
    Map<UUID,String> map = new HashMap<>();
    
    // Attributes:
    String buildingName;
    ArrayList<Devices> buildingDevices;
    UUID uuid = UUID.randomUUID();
    
    
    // Constructor(s):
    public Buildings(String buildingName) {
        this.buildingName = buildingName;
        this.buildingDevices = new ArrayList<>();
        map.put(this.uuid, this.buildingName);
        
    }
    
    
    // Methods:
    
    public String getBuildingName() {
        return buildingName;
    }

    public UUID getUuid() {
        return uuid;
    }
    
    public void addBuilding(Buildings b) {
        buildingList.add(b);
    }
    
    public void removeBuilding(Buildings b) {
        for (Buildings bl : buildingList) {
            if (b.getBuildingName().equals(bl))
            buildingList.remove(bl);
            }
        }
        
      
    
    public void addDevice(Devices c) {
        buildingDevices.add(c);
    }
    
    public void removeDevice(Devices d) {
        for (Devices bd : buildingDevices) {
            if (d.getId() == bd.getId()) {
            buildingList.remove(bd);
            }
        }
    }
    
    public ArrayList<Buildings> getBuildingList() {
        return buildingList;
    }
    
    public ArrayList<Devices> getDeviceList() {
        return buildingDevices;
    }
    
    @Override
    public String toString() {
        return buildingName;
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        return this.map;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
