/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;
import java.util.Scanner;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : If at first you don't  succed, call it version 1.0
// Prodi : D-IV TRPL

public class OperasiString {  
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Memasukan nama lengkap
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();
        
        // Menampilkan panjang nama 
        System.out.println("Panjang string: " + nama.length());
        
        // Menampilkan huruf pertama dan apakah mengandung spasi
        System.out.println("Huruf pertama: " + nama.charAt(0)); 
        System.out.println("Mengandung spasi? " + nama.contains(" ")); 
        
     }
}

// Pertanyaan Pemantik:
/*
- Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
Jawab: 
ika nama memiliki lebih dari satu spasi, length() tetap menghitung semua spasi tersebut sebagai karakter.
Sementara itu, contains(" ") tetap menghasilkan true selama ada minimal satu spasi di dalam nama.
*/