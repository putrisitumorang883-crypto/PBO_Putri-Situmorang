/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

// Nim : 41425059
// Nama : Putri Yuni Br Situmorang
// Motto : If a first you don't succed, call it version 1.0

import java.util.Scanner;


public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = scanner.nextInt();
 
        // Generate deret Fibonacci  tiap angka = jumlah 2 angka sebelumnya
        System.out.println("Deret Fibonacci:");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
 
        // Check prime number
        System.out.print("Masukkan bilangan untuk dicek prima: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
 
        if (num <= 1) {
            isPrime = false; // 0, 1, dan negatif bukan bilangan prima
        } else {
            // cek sampai akar kuadrat num a
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; //  gak perlu lanjut cek
                }
            }
        }
 
        System.out.println(num + (isPrime ? " adalah bilangan prima" : " bukan bilangan prima"));
    }
}


/* Pertanyaan Pemantik 
Bagaimana cara mengoptimalkan algoritma Fibonacci untuk jumlah yang besar?
Jawab: Caranya yaitu buat n besar  pakai long/BigInteger biar gak overflow, terus ganti loop biasa (O(n)) ke matrix exponentiation yang bisa O(log n) 
jauh lebih cepat karena pakai teknik fast exponentiation kayak 2^10 = 2^5 * 2^5, bukan dikaliin satu-satu.
*/