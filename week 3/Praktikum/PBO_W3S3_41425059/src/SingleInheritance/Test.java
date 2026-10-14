/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleInheritance;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPl

class Vehicle {

    // Constructor dari class parent.
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Car mewarisi class Vehicle.
class Car extends Vehicle {

    // Constructor dari class Car.
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

public class Test {

    public static void main(String[] args) {

        // Membuat object Car.
        Car obj = new Car();
    }
}    
