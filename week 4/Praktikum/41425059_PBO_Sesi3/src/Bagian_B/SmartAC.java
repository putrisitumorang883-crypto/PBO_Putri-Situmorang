/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


// AC pintar: implementasi Switchable + Connectable
public class SmartAC implements Switchable, Connectable {

    // Atribut private: enkapsulasi state internal
    private int temperature;        // suhu target (Celsius)
    private boolean isOn;
    private boolean isConnected;

    // Constructor: inisialisasi suhu (default belum nyala)
    public SmartAC(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
        this.isConnected = false;
    }

    // Override turnOn: nyalakan AC
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + temperature + " C");
    }

    // Override turnOff: matikan AC + putus WiFi
    @Override
    public void turnOff() {
        isOn = false;
        isConnected = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    // Override connectToWifi: guard clause cek status nyala
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println("[Error] AC Pintar harus dinyalakan sebelum koneksi WiFi!");
            return;
        }
        isConnected = true;
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid
                + " (IP: " + ipAddress + ")");
    }
}