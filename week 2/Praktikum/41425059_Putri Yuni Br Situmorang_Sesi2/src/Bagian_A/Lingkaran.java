/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;
// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : If at first you don't  succed, call it version 1.0
// Prodi : D-IV TRPL

import java.util.Scanner; // Mengimpor Scaner untuk input

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14; // Nilai Konstanta PI
        
        // Memasukan jari-jari lingkaran
        System.out.print("Masukkan Jari Jari: ");
        double r = input.nextDouble();
        // Memeriksa apakah jari-jari negatif
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        }else{
            // Menghitung luas dan keliling
            double luas = PI * r * r;
            double keliling = 2 * PI *r;
            // Menampilkan hasil perhitungan
            System.out.println("Luas: " + luas);
            System.out.println("keliling: " + keliling);
        }
    }
}

/*
 - Mengapa kita perlu validasi r < 0?
Jawab:
Karena jari-jari lingkaran tidak boleh bernilai negatif. 
Dengan validasi r < 0, program bisa menampilkan pesan error 
jika pengguna memasukkan jari-jari negatif dan tidak melanjutkan perhitungan luas maupun keliling.

- Dalam aplikasi nyata, di mana validasi input sangat penting?
Jawab: 
Validasi input penting pada aplikasi pendaftaran mahasiswa, login, kasir, dan pengisian data pribadi.
Tujuannya agar data yang dimasukkan sesuai dengan ketentuan dan tidak menyebabkan kesalahan saat program dijalankan.
*/
