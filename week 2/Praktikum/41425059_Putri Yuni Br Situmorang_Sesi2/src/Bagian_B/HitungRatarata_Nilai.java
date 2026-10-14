/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

import java.util.Scanner;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Langkah kecil setiap hari akan membawa hasil yang besar.
// Prodi : D-IV TRPL

public class HitungRatarata_Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan tiga nilai ujian
        System.out.print("Masukkan nilai 1: ");
        double nilai1 = input.nextDouble(); // Menerima inputan dari user yg berbentuk angka desimal

        System.out.print("Masukkan nilai 2: ");
        double nilai2 = input.nextDouble();

        System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();

        // Menghitung rata-rata nilai
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Menampilkan hasil
        System.out.printf("Rata-rata: %.2f%n", rataRata);
    }
}
