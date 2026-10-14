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
public class DataDiri {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan data diri mahasiswa
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();

        System.out.print("Mahasiswa aktif (true/false): ");
        boolean status = input.nextBoolean();

        // Melakukan casting tinggi badan
        int tinggiCasting = (int) tinggi;

        // Menampilkan data mahasiswa
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi badan: " + tinggi);
        System.out.println("Status mahasiswa: " + status);
        System.out.println("Tinggi setelah casting: " + tinggiCasting);

        input.close();
    }
}

