package oopworkshop1;

import java.util.ArrayList;

public class Buildings {
    
    ArrayList<Buildings> buildingList = new ArrayList<>();
    
    // Attributes:
    String buildingName;
    ArrayList<Devices> buildingDevices;
    
    // Constructor(s):
    public Buildings(String buildingName) {
        this.buildingName = buildingName;
        this.buildingDevices = new ArrayList<>();
        
        
    }
    
    
    // Methods:
    
    public String getBuildingName() {
        return buildingName;
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
            if (d.getId == bd.getId) {
            buildingList.remove(bd);
            }
        }
    }
    
    public ArrayList<Buildings> getBuildingList() {
        return buildingList;
    }
    
}
