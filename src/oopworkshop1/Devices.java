/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopworkshop1;

/**
 *
 * @author sebab_000
 */
public class Devices {
    
    //Attributes
    private int id;
    private String location;

    public Devices(String location, int id) {
        this.id = id;
        this.location = location;
    }
    
    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }
    
    public void getDeviceList(Buildings b) {
        System.out.println(b.getDeviceList());
    }
    
    @Override
    public String toString() {
        return "Device Id: " + this.id + " and device location: " + this.location;
    }

}
