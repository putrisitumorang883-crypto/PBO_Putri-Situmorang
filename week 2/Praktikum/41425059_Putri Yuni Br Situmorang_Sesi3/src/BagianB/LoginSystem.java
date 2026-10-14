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

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Akun yang udah terdaftar (dianggap data di sistem)
        String correctUsername = "admin";
        String correctPassword = "password123";
 
        int maxAttempt = 3;
        boolean loginSuccess = false;
 
        System.out.println("=== Sistem Login ===");
 
        for (int attempt = 1; attempt <= maxAttempt; attempt++) {
            System.out.println("Percobaan " + attempt + ":");
 
            System.out.print("Username: ");
            String username = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();
 
            //  panjang username (5-10 karakter)
            if (username.length() < 5 || username.length() > 10) {
                System.out.println("Login gagal! Username harus 5-10 karakter.");
                continue;
            }
 
            // password minimal 8 karakter dan harus mengandung angka
            if (password.length() < 8 || !containsDigit(password)) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
                continue;
            }
 
            // Mencocokan dengan akun terdaftar
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login berhasil!");
                loginSuccess = true;
                break;
            } else {
                System.out.println("Login gagal! Password salah.");
            }
        }
 
        if (!loginSuccess) {
            System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
        }
 
        scanner.close();
    }
 
    // Fungsi bantu buat ngecek apakah string mengandung minimal 1 angka
    static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
