/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


public class VehicleRental {

    public String plateNumber;    // plat nomor, bisa diakses dari mana saja
    protected double rentalRatePerDay; // tarif sewa, hanya package sama / subclass
    private int rentalDays;   // jumlah hari sewa, hanya di dalam kelas ini
    double discountRate;     // diskon, akses default (package sama)

    // Constructor: mengisi plat nomor dan tarif sewa
    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }

    // Setter untuk mengubah jumlah hari sewa
    public void setRentalDays(int days) {
        this.rentalDays = days;
    }

    // Menghitung total biaya setelah diskon
    // Parameter Discountable = objek diskon yang dikirim saat runtime (polimorfisme)
    public double getTotalCost(Discountable discount) {
        double amount = rentalRatePerDay * rentalDays;   // harga dasar
        double discountAmount = discount.calculateDiscount(amount); // hitung potongan
        return amount - discountAmount;    // total setelah diskon
    }
}