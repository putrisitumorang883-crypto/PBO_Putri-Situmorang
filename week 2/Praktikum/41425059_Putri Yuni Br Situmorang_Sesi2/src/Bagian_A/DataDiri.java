/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

// Nama  : Putri Yuni Br Situmorang
// Nim   : 41425059
// Motto : If at first you don't  succed, call it version 1.0
// Prodi : D-IV TRPL

public class DataDiri {
    public static void main(String[] args) {
        // Mmebuat Variabel menyimpan data diri
        String nama = "Andi";
        int umur = 19;
        double tinggi = 165.8;
        boolean isMahasiswa = true;
     // Menampilkan semua data memakai println, tanda + buat gabungin teks & angka
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);
        
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}