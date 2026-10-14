/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

// File: CreditCardPayment.java
// Implementasi PaymentMethod untuk kartu kredit
public class CreditCardPayment implements PaymentMethod {

    // Atribut private: enkapsulasi nomor kartu
    private String cardNumber;

    // Constructor: inisialisasi nomor kartu
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Override metode pay: verifikasi & proses pembayaran kartu kredit
    @Override
    public void pay(double amount) {
        // Tampilkan detail transaksi kartu kredit (tanpa biaya admin)
        System.out.println("[Credit Card " + cardNumber
                + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount);
    }

    // Override metode getPaymentDetails: info metode pembayaran
    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}
