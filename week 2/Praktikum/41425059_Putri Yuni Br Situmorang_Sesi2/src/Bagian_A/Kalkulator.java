/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;
// Nama  : Putri Yuni Br Situmorang
// Nim   : 41425059
// Motto : If at first you don't  succed, call it version 1.0
// Prodi : D-IV TRPL

import java.util.Scanner; // Mengimpor Scanner untuk membaca input
public class Kalkulator {
    public static void main(String[] args) {
         // Membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta dan membaca angka pertama dan kedua 
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        // Operasi Aritmatika
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
    }
}


/*
Pertanyaan Pemantik 

- Praktek 1: Apa perbedaan nilai asli double dengan hasil casting int?
jawab: 
Tipe data double bisa menyimpan angka desimal, sedangkan int hanya menyimpan bilangan bulat.
Jika nilai double diubah menjadi int menggunakan casting, angka di belakang koma akan dihilangkan,
 bukan dibulatkan.

- Praktek 2: Mengapa pembagian int perlu di-casting ke double?
Jawab:
Karena jika dua bilangan bertipe int dibagi, hasilnya hanya berupa bilangan bulat 
dan angka desimalnya akan dibuang. Dengan casting ke double, hasil pembagian bisa menampilkan angka desimal 
sehingga lebih tepat.

- Praktek 2: Apa risiko jika pembagi = 0?
Jawab: 
Jika pembagi bernilai 0, pembagian bilangan bulat akan menyebabkan error atau ArithmeticException. 
Karena itu, program perlu memeriksa terlebih dahulu apakah pembagi tidak sama dengan 0 
agar program tidak mengalami error saat dijalankan.
*/