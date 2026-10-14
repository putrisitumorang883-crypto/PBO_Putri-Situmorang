/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
 
         if (pilihan == 1) {
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = scanner.nextInt();
 
         // Bagi total detik jadi jam, menit, sisa detik
            int jam = totalDetik / 3600;
            int menit = (totalDetik % 3600) / 60;
            int detik = totalDetik % 60;
 
         // %02d biar selalu tampil 2 digit, misal 01 bukan 1
            System.out.printf("Hasil: %02d:%02d:%02d%n", jam, menit, detik);
 
        } else if (pilihan == 2) {
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = scanner.next();
 
         // Pecah string berdasarkan tanda ":" jadi 3 bagian
            String[] bagian = waktu.split(":");
            int jam = Integer.parseInt(bagian[0]);
            int menit = Integer.parseInt(bagian[1]);
            int detik = Integer.parseInt(bagian[2]);
 
         // Mengubah ke detik 1 jam = 3600 detik, 1 menit = 60 detik
            int totalDetik = (jam * 3600) + (menit * 60) + detik;
            System.out.println("Hasil: " + totalDetik + " detik");
 
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
