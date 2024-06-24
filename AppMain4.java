
package com.AppMain4;
import com.load1.Vehicle;

public class AppMain4 {
    public static void main(String[] args) {
        // 0 constructor called
        Vehicle vc1 = new Vehicle ();
        System.out.println("the features of vehicle1 are :");
        vc1.displayVehicle();
        
        // paramterized constructor
        Vehicle vc2 = new Vehicle (3 , "non tubeless" );
         System.out.println("the features of vehicle2 are :");
        vc2.displayVehicle();
    }
}
