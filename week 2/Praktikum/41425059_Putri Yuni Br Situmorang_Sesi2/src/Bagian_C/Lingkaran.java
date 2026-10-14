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


public class Lingkaran {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        // Memasukkan jari-jari lingkaran
        System.out.print("Masukkan Jari Jari: ");
        double r = input.nextDouble();

        // Memeriksa apakah jari-jari negatif
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            // Menghitung luas dan keliling
            double luas = PI * r * r;
            double keliling = 2 * PI * r;

            // Menampilkan hasil
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }

        input.close();
    }   
}
