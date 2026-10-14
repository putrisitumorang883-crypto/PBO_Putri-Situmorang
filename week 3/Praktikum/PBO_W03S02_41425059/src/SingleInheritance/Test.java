/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleInheritance;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle"); // Menampilkan pesan dari superclass[cite: 6]
    }
}

// Subclass[cite: 6]
class Car extends Vehicle { // Kelas Car mewarisi kelas Vehicle[cite: 6]
    Car() {
        System.out.println("This Vehicle is Car"); // Menampilkan pesan dari subclass[cite: 6]
    }
}

public class Test {
    public static void main(String[] args) {
        Car obj = new Car(); // Membuat objek dari subclass Car[cite: 6]
    }
}
