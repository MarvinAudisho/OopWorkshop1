package oopworkshop1;

public class OopWorkshop1 {

    public static void main(String[] args) {
        
        // F01
        Buildings b1 = new Buildings("SDU");
        Buildings b2 = new Buildings("KP");
        b1.addBuilding(b1);
        b2.addBuilding(b2);
        
        // F02
        b2.removeBuilding(b2);
        
        // F03 + F06 + F07
        Co2Censor s1 = new Co2Censor(2.2, "U50a", 1);
        Actuators a1 = new Actuators(100, "U55", 1);
        TempCensor t1 = new TempCensor(7, "U55", 1);
        b1.addDevice(s1);
        b1.addDevice(a1);
        b1.addDevice(t1);
        
        // F04
        b1.removeDevice(s1);
        
        // F05
        b1.getDeviceList();
        
        // F08 + F09
        a1.setValue(50);
        a1.getValue();
        
        // F10
        System.out.println("123");
        System.out.println(b1.getBuildingList());
        System.out.println("123");
        
        // F11 + F12
        Devices device = new Devices("test", 123);
        device.getDeviceList(b1);
        
    }
    
}
