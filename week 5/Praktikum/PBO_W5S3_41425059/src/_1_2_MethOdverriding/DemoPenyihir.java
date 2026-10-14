/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_2_MethOdverriding;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL
// Minggu : 5 sesi 3

import java.util.*;

// Kelas induk (parent) untuk semua penyihir
class Penyihir {
    // Method dasar yang nanti bisa ditimpa (override) oleh subclass
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Kelas anak: HarryPotter — menimpa method ucapkanMantra()
class HarryPotter extends Penyihir {
    @Override  // penanda bahwa method ini menimpa method parent
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Kelas anak: Hermione, menimpa method ucapkanMantra()
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// kelas RonWeasley ,juga menimpa method ucapkanMantra()
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        // Ron khas: sering ragu dan kadang salah ucap
        System.out.println("Ron Weasley mengucapkan mantra dengan ragu-ragu, kadang salah.");
    }
}

// Kelas utama untuk menjalankan program
public class DemoPenyihir {
    public static void main(String[] args) {
        // POLYMORPHISM: variabel bertipe Penyihir, tapi objeknya subclass
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();   // tambahan Ron

        // Method yang dipanggil menyesuaikan objek aslinya (dynamic dispatch)
        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
        penyihir3.ucapkanMantra();
    }
}

/* 
1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih berjalan?

Jawab:
Masih jalan, @Override itu cuma anotasi bantuan buat programmer dan compiler. 
Fungsinya yaitu Kalau kita salah tulis (misal ucapkanMantraa() atau parameter beda), compiler langsung kasih error.
Tanpa @Override, kalau salah tulis, Java malah bikin method baru (bukan override), dan program tetap compile, tapi hasilnya bukan yang kita mau.
Jadi @Override itu semacam "pengaman" biar kita sadar kalau method kita benar-benar menimpa method parent.

2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
Jawab:
Keuntungannya yaitu Kita bisa simpan berbagai objek penyihir dalam satu tipe (Penyihir), lalu panggil method yang sama (ucapkanMantra()) tanpa peduli itu Harry, Hermione, atau Ron.
Kode jadi fleksibel dan extensible: mau tambah penyihir baru (misal Dumbledore), tinggal bikin class baru, gak perlu ubah kode di main.
Ini yang disebut dynamic method dispatch, Java otomatis pilih method sesuai objek asli saat runtime.
*/
