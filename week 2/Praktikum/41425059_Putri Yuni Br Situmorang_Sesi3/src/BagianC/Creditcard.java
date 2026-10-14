/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

import java.util.Scanner;

public class Creditcard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Masukkan nomor kartu: ");
        String input = scanner.next();
 
        // Buang semua tanda hubung dulu biar gampang dicek jumlah digitnya
        String angkaSaja = input.replace("-", "");
 
        boolean valid = true;
        String pesanError = "";
 
        // Mengecek harus 16 digit (setelah tanda hubung dibuang)
        if (angkaSaja.length() != 16) {
            valid = false;
            pesanError = "Harus terdiri dari 16 digit.";
        } else {
            // Mengecek semua karakter harus angka
            for (int i = 0; i < angkaSaja.length(); i++) {
                if (!Character.isDigit(angkaSaja.charAt(i))) {
                    valid = false;
                    pesanError = "Hanya boleh berisi angka dan tanda hubung.";
                    break;
                }
            }
        }
 
        // Mengecek  harus diawali 4, 5, atau 6
        if (valid) {
            char digitPertama = angkaSaja.charAt(0);
            if (digitPertama != '4' && digitPertama != '5' && digitPertama != '6') {
                valid = false;
                pesanError = "Harus dimulai dengan 4, 5, atau 6.";
            }
        }
 
       
        // mengecek  4 digit - 4 digit - 4 digit - 4 digit, panjang total 19 karakter)
        if (valid && input.contains("-")) {
            if (input.length() != 19 || input.charAt(4) != '-' || input.charAt(9) != '-' || input.charAt(14) != '-') {
                valid = false;
                pesanError = "Tanda hubung harus diletakkan setiap 4 digit.";
            }
        }
 
        if (valid) {
            System.out.println("Nomor kartu valid.");
        } else {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println(pesanError);
        }
    }
}
