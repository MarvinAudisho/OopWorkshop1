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
public class Co2Censor extends Devices{
    //attributes
    private double CO2;
    
    //constructor

    public Co2Censor(double CO2) {
        this.CO2 = CO2;
    }
    
    
    // getter
    public double getCO2() {
        return CO2;
    }
    
}
