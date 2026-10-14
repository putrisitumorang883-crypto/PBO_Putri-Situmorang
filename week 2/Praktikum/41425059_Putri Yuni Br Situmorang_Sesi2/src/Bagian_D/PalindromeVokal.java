/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_D;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

import java.util.Scanner;


public class PalindromeVokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan kata
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine().toLowerCase(); // 

        // Membalikkan kata
        String balik = new StringBuilder(kata).reverse().toString();

        // Memeriksa palindrome
        if (kata.equals(balik)) {
            System.out.println("Kata adalah palindrome.");
        } else {
            System.out.println("Kata bukan palindrome.");
        }

        // Menghitung jumlah huruf vokal
        int jumlahVokal = 0;

        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);

            if ("aiueo".indexOf(huruf) != -1) {
                jumlahVokal++;
            }
        }

        // Menampilkan jumlah vokal
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
    }   
}
