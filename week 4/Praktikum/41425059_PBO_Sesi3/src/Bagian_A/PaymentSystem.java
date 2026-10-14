/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


// Kelas utama: simulasi sistem pembayaran digital
public class PaymentSystem {
    public static void main(String[] args) {

        // Polimorfisme: referensi interface menunjuk objek konkret berbeda
        PaymentMethod payment1 = new EWalletPayment("08123456789");
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");

        // Panggil metode yang sama, hasil berbeda sesuai implementasi
        payment1.pay(50000);
        payment2.pay(150000);
    }
}