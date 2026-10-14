/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

// Interface: kontrak standar untuk semua metode pembayaran
public interface PaymentMethod {

    // Konstanta biaya admin (implicitly public static final)
    double TRANSACTION_FEE = 2500.0;

    // Metode abstrak: wajib diimplementasikan oleh kelas konkret
    void pay(double amount);            // proses pembayaran
    String getPaymentDetails();         // detail metode pembayaran
}