/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Copy_Construct;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL

class Geeks {

    // Data member untuk menyimpan nama dan ID.
    String name;
    int id;

    // Parameterized constructor.
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy constructor untuk menyalin data object lain.
    Geeks(Geeks obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
    

