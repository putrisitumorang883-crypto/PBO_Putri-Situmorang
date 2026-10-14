/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


// Interface: kontrak kemampuan sakelar (nyala/mati)
public interface Switchable {

    // Method abstrak: wajib diimplementasikan oleh kelas konkret
    void turnOn();    // menyalakan perangkat
    void turnOff();   // mematikan perangkat
}