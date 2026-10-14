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
public class KasirSederhana {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan data barang
        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine(); // Menerima inputan dari user berupa baris

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble(); //Menerima inputan dari user berupa angka desimal   

        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt(); // Menerima Inputan dari user berupa angka bulat 

        // Menghitung total belanja
        double total = harga * jumlah;
        double diskon = 0;

        // Memberikan diskon jika memenuhi syarat
        if (total >= 100000) {
            diskon = total * 0.10;
        }

        // Menghitung total pembayaran
        double totalBayar = total - diskon;

        // Menampilkan rincian belanja
        System.out.println("Nama barang: " + nama);
        System.out.println("Total sebelum diskon: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);
    }
}
