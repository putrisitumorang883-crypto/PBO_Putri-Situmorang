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

public class LoginSederhana {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan username dan password
        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        // Memeriksa apakah password mengandung angka
        boolean adaAngka = password.matches(".*\\d.*");

        // Memvalidasi username dan password
        if (username.equals("admin")
                && password.length() >= 6
                && adaAngka) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }
    }
}
