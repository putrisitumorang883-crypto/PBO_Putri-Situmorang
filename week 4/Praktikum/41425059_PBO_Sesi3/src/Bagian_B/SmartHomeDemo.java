/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


// Kelas utama: simulasi smart home
public class SmartHomeDemo {
    public static void main(String[] args) {

        // Buat perangkat
        SmartLamp lamp = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        // --- Skenario Lampu ---
        lamp.turnOn();                                              
        lamp.connectToWifi("Rumah_Indah_5G", "192.168.1.50");       

        // --- Skenario AC ---
        ac.turnOn();                                          // nyalakan
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");   // konek WiFi

        // Matikan AC
        ac.turnOff();

        // --- Uji error: perangkat mati coba konek WiFi ---
        SmartLamp lamp2 = new SmartLamp(50);                   // belum dinyalakan
        lamp2.connectToWifi("Rumah_Indah_5G", "192.168.1.99");  // harus error
    }
}
