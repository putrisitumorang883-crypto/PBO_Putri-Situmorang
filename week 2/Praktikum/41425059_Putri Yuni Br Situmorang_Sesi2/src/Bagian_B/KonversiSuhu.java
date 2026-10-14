/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;


// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

import java.util.Scanner;
public class KonversiSuhu {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memilih jenis konversi suhu
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        System.out.print("Pilih konversi: ");
        int pilihan = input.nextInt(); // Menerima inputan dari user yg tipe data integer

        // Memasukkan suhu dan menghitung hasil
        if (pilihan == 1) {
            System.out.print("Masukkan suhu dalam Celsius: ");
            double c = input.nextDouble();

            double f = (c * 9 / 5) + 32;

            System.out.printf("%.1f C = %.1f F%n", c, f);

        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double f = input.nextDouble();

            double c = (f - 32) * 5 / 9;

            System.out.printf("%.1f F = %.2f C%n", f, c);

        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
