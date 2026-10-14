/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


// Interface: kontrak kemampuan koneksi WiFi
public interface Connectable {

    // Method abstrak: menerima SSID & IP address
    void connectToWifi(String ssid, String ipAddress);
}