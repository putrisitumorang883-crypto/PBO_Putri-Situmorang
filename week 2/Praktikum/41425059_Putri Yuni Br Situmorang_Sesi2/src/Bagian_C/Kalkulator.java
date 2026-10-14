/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_C;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL


import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        // Menghitung operasi aritmatika
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Pengurangan: " + (a - b));
        System.out.println("Perkalian: " + (a * b));

        // Memeriksa pembagi tidak boleh nol
        if (b != 0) {
            System.out.println("Pembagian: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Pembagian dan modulus tidak bisa dengan nol.");
        }

        // Menghitung perpangkatan
        System.out.println("Pangkat: " + Math.pow(a, b));

        input.close();
    }
}
