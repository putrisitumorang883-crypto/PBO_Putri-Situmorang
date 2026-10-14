/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


// Implementasi PaymentMethod untuk dompet digital (E-Wallet)
public class EWalletPayment implements PaymentMethod {

    // Atribut private: enkapsulasi nomor HP agar tidak bisa diakses langsung dari luar
    private String phoneNumber;

    // Constructor: inisialisasi nomor HP saat objek dibuat
    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override metode pay: memproses pembayaran + menambahkan biaya admin
    @Override
    public void pay(double amount) {
        // Hitung total bayar = nominal + biaya admin dari konstanta interface
        double total = amount + TRANSACTION_FEE;

        // Tampilkan detail transaksi e-wallet
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    // Override metode getPaymentDetails: mengembalikan info metode pembayaran
    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}
