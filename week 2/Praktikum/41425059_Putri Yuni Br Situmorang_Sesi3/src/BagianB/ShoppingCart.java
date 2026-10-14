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

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String[] items = new String[100]; // array penampung item, kapasitas 100
        int jumlahItem = 0; // jumlah item yang lagi ada di daftar
 
        boolean running = true;
 
        while (running) {
            System.out.println("=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
 
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan item: ");
                    String itemBaru = scanner.next();
                    items[jumlahItem] = itemBaru; // taruh item baru di posisi kosong berikutnya
                    jumlahItem++;
                    System.out.println(itemBaru + " berhasil ditambahkan!");
                    break;
 
                case 2:
                    System.out.print("Hapus item pada posisi: ");
                    // dikurangi 1 karena user liat dari nomor 1
                    int posHapus = scanner.nextInt() - 1; 
                    if (posHapus >= 0 && posHapus < jumlahItem) {
                        String namaTerhapus = items[posHapus];
                     // geser semua item setelahnya ke kiri buat nutup celah
                        for (int i = posHapus; i < jumlahItem - 1; i++) {
                            items[i] = items[i + 1];
                        }
                        jumlahItem--;
                        System.out.println(namaTerhapus + " berhasil dihapus!");
                    } else {
                        System.out.println("Posisi tidak valid!");
                    }
                    break;
 
                case 3:
                    System.out.println("Daftar belanja:");
                    for (int i = 0; i < jumlahItem; i++) {
                        System.out.println((i + 1) + ". " + items[i]);
                    }
                    break;
 
                case 4:
                    System.out.print("Cari item: ");
                    String kataDicari = scanner.next();
                    boolean ketemu = false;
                    for (int i = 0; i < jumlahItem; i++) {
                        if (items[i].equalsIgnoreCase(kataDicari)) {
                            System.out.println(kataDicari + " ditemukan pada posisi " + (i + 1));
                            ketemu = true;
                            break;
                        }
                    }
                    if (!ketemu) {
                        System.out.println(kataDicari + " tidak ditemukan.");
                    }
                    break;
 
                case 5:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

    }
}
