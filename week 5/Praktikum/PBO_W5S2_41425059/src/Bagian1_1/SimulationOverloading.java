/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_1;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


class MesinTarif {

    // Atribut buat nyimpen kota asal pengiriman
    private String kotaAsal;

    // Constructor: dipanggil saat objek MesinTarif dibuat
    // Parameter kotaAsal dipakai buat ngisi atribut kotaAsal
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // OVERLOADING 1: hitung ongkir cuma berdasarkan berat
    // Rumus: berat x 10.000
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // 2  hitung ongkir + asuransi
    // Asuransi = 1% dari nilai barang, terus ditambah ongkir dasar
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // 3 hitung ongkir + opsi ekspres
    // Kalau ekspres, ada tambahan biaya 20.000
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000;
        }
        return total;
    }
}

// Class utama buat nyoba semua versi method hitungOngkir
// Class ini public, jadi nama file harus sama: SimulasiOverloading.java
public class SimulationOverloading {

    public static void main(String[] args) {

        // Bikin objek MesinTarif dengan kota asal "Medan"
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");

        // Panggil versi 1: cuma butuh berat 2.0 kg
        System.out.println("Ongkir Biasa (2.0 Kg)  : Rp " + tarif.hitungOngkir(2.0));

        // Panggil versi 2: berat 2.0 kg + nilai barang 50 juta
        System.out.println("Ongkir + Asuransi (Barang 50Jt): Rp " + tarif.hitungOngkir(2.0, 50000000));

        // Panggil versi 3: berat 2.0 kg + status ekspres = true
        System.out.println("Ongkir Express (2.0 Kg) : Rp " + tarif.hitungOngkir(2.0, true));
    }
}


/*
  Lembar Analisis Overloading:
 
  1. Mengapa compiler Java dapat menentukan method hitungOngkir mana
     yang dijalankan sebelum program dieksekusi (compile-time)?
 
     Jawaban:
     Compiler dapat menentukan method hitungOngkir() yang digunakan pada
     saat compile-time karena setiap method memiliki parameter yang berbeda.
     Compiler memeriksa jumlah, tipe data, dan urutan parameter pada saat
     method dipanggil. Dari parameter tersebut, compiler dapat menentukan
     method mana yang paling sesuai sebelum program dijalankan.
 
  2. Jika pada class MesinTarif ditambahkan method berikut:
 
     public int hitungOngkir(double beratKg) {
         return (int)(beratKg  10000);
     }
 
     Mengapa compiler menolak kode tersebut padahal tipe kembaliannya
     berbeda (int vs double)?
 
     Jawaban:
     Compiler menolak method tersebut karena parameter method-nya sama
     persis dengan method yang sudah ada, yaitu hitungOngkir(double).
     Dalam method overloading, perbedaan hanya pada tipe return tidak
     cukup untuk membuat method dianggap berbeda. Jadi, method
     hitungOngkir(double) dengan return type double dan method
     hitungOngkir(double) dengan return type int dianggap memiliki
     signature yang sama dan menyebabkan konflik.
 */