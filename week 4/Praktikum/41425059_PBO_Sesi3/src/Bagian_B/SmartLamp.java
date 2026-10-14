/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


// Lampu pintar: implementasi Switchable + Connectable
public class SmartLamp implements Switchable, Connectable {

    // Atribut private: enkapsulasi state internal
    private int brightness;         // persentase kecerahan (0-100)
    private boolean isOn;           // status sakelar
    private boolean isConnected;    // status koneksi WiFi

    // Constructor: inisialisasi kecerahan (default belum nyala)
    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
        this.isConnected = false;
    }

    // Override turnOn: nyalakan lampu
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + brightness + "%");
    }

    // Override turnOff: matikan lampu + putus WiFi (state management)
    @Override
    public void turnOff() {
        isOn = false;
        isConnected = false;   // WiFi ikut terputus saat lampu mati
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    // Override connectToWifi: guard clause cek status nyala dulu
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Tolak koneksi jika perangkat masih mati
        if (!isOn) {
            System.out.println("[Error] Lampu Pintar harus dinyalakan sebelum koneksi WiFi!");
            return;
        }
        isConnected = true;
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid
                + " (IP: " + ipAddress + ")");
    }
}
