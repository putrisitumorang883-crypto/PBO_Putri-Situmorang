/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;


import java.util.Scanner;
// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

public class SisaBagiPangkat {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt(); // 

        // Menghitung sisa bagi
        if (b != 0) {
            System.out.println("Sisa bagi: " + (a % b));
        } else {
            System.out.println("Sisa bagi tidak bisa dibagi nol.");
        }

        // Menghitung pangkat
        System.out.println("Pangkat: " + Math.pow(a, b));
}
}
