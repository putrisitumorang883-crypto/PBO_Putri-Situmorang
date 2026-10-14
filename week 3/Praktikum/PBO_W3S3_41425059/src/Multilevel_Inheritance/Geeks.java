/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multilevel_Inheritance;

// Nama : Putri Yuni Br Situmorang
// Nim  : 41425059
// Prodi: D-IV TRPL

class Vehicle {

    // Constructor dari class Vehicle.
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// FourWheeler mewarisi class Vehicle.
class FourWheeler extends Vehicle {

    // Constructor dari class FourWheeler.
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

// Car mewarisi class FourWheeler.
class Car extends FourWheeler {

    // Constructor dari class Car.
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class Geeks {

    public static void main(String[] args) {

        // Membuat object Car.
        Car obj = new Car();
    }
}   
