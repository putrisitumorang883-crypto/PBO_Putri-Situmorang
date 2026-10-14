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
public class GanjilGenap {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan bilangan
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt(); // Menerima inputan dari user yg tipe data integer

        // Memeriksa sisa bagi dengan 2
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }
    }
}
