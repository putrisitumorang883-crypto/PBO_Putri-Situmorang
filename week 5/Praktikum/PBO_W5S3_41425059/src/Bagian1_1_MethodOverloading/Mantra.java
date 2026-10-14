/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_1_MethodOverloading;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL
// Minggu : 5 sesi 3


public class Mantra {

    // Method 1: overloading tanpa parameter
    // Dipakai kalau mantra diucapkan secara umum saja
    public void ucapkan() {
        System.out.println("Mengucapkan mantra dengan efek standar.");
    }

    // Method 2: overloading dengan 1 parameter (namaMantra)
    // Dipakai kalau kita mau sebut nama mantranya saja
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Method 3: overloading dengan 3 parameter (namaMantra, target, kekuatan)
    // Dipakai kalau mantra diarahkan ke target dengan kekuatan tertentu
    public void ucapkan(String namaMantra, String target, int kekuatan) {
        System.out.println("Mengucapkan " + namaMantra
                + " ke arah " + target
                + " dengan kekuatan " + kekuatan + ".");
    }

    // TUGAS NO.2: tambahkan overload dengan parameter (namaMantra, target)
    // Tanpa parameter kekuatan — efeknya beda dari yang pakai kekuatan
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan " + namaMantra
                + " ke arah " + target + " (tanpa kekuatan tambahan).");
    }

    // TUGAS PERTANYAAN: method dengan urutan parameter berbeda
    // Perhatikan: urutan (int, String) beda dengan (String, int) — ini tetap valid
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan " + namaMantra
                + " dengan kekuatan " + kekuatan + ".");
    }

    // Main untuk testing
    public static void main(String[] args) {
        Mantra m = new Mantra();
        m.ucapkan();                      // method 1
        m.ucapkan("Expelliarmus");               // method 2
        m.ucapkan("Expelliarmus", "Draco", 50); // method 3
        m.ucapkan("Expelliarmus", "Draco");    // method 4
        m.ucapkan(100, "Expelliarmus");       // method 5 
    }
}



/*Jawaban Pertanyaan 1.1
1. Apa yang terjadi jika kita menghapus salah satu method overloading, misalnya method dengan dua parameter?
Jawab: 
Kalau method ucapkan(String, String) dihapus, maka baris m.ucapkan("Expelliarmus", "Draco"); akan error saat compile (cannot find symbol). 
Karena Java mencari method yang cocok dengan jumlah dan tipe argumen. Kalau tidak ada yang cocok, ya error. Tapi selama pemanggilan lain masih ada pasangannya, kode lain tetap jalan.

2. Bisakah kita membuat method overloading dengan urutan parameter yang berbeda?
Jawab: 
Bisa, Contoh ucapkan(int kekuatan, String namaMantra) itu sah dan beda dari ucapkan(String namaMantra, int kekuatan)
asalkan tipe parameternya beda urutan. Tapi kalau tipenya sama semua (misal ucapkan(String, String) vs ucapkan(String, String))
itu tidak boleh karena dianggap duplikat.*/