
package com.load1;

public class Vehicle {
        private int brakes;
        private String wheel;
    
public Vehicle( )
{                               //0 argument constructor
        brakes = 2;
        wheel = "tubeless";
}
public Vehicle(int b , String whl ){
      brakes = b;
      wheel = whl;
}
public void displayVehicle(){
    System.out.println("the no. of brake in vehicle are :" + brakes + " \n type of wheel is " + wheel);
}

}