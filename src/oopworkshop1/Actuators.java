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
public class Actuators extends Devices {
    // attribute
    private int value;
    
    // constructor

    public Actuators(int value) {
        this.value = value;
    }
    
    
    // getter
    public int getValue() {
        return value;
    }
    
    // setter
    public void setValue(int value) {
        this.value = value;
    }
    
    
}
