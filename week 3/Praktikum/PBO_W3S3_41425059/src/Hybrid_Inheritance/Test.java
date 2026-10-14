/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hybrid_Inheritance;

// Nama : Putri Yuni Br Situmorang
// Nim  : 41425059
// Prodi: D-IV TRPL

interface LandVehicle {

    // Method untuk kendaraan darat.
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}

interface WaterVehicle {

    // Method untuk kendaraan air.
    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}

// Class mengimplementasikan dua interface.
class AmphibiousVehicle implements LandVehicle, WaterVehicle {

    // Constructor AmphibiousVehicle.
    AmphibiousVehicle() {
        System.out.println("This is an AmphibiousVehicle");
    }
}

public class Test {

    public static void main(String[] args) {

        // Membuat object AmphibiousVehicle.
        AmphibiousVehicle obj = new AmphibiousVehicle();

        // Memanggil method dari WaterVehicle.
        obj.waterInfo();

        // Memanggil method dari LandVehicle.
        obj.landInfo();
    }
}
   
