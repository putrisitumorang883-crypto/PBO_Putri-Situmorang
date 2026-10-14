/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2_1AbstrakClass;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL
// Minggu : 5 sesi 3


import java.util.*;

// Abstract class: kelas "belum lengkap" yang jadi kerangka untuk subclass
abstract class MantraAbstrak {
    private String nama;   

    // Constructor untuk mengisi nama mantra
    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method TIDAK punya isi, WAJIB diimplementasikan subclass
    public abstract void efek();

    // Method konkret sudah punya isi, bisa langsung dipakai subclass
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

// Subclass konkret 1: Expelliarmus
class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");   // panggil constructor parent
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

// Subclass ExpectoPatronum
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// subclass baru Lumos
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat.");
    }
}

// Kelas utama
public class DemoMantraAbstrak {
    public static void main(String[] args) {
        // POLYMORPHISM: variabel bertipe MantraAbstrak, objeknya subclass
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();   // tambahan

        // Panggil method konkret dan abstract
        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        mantra3.ucapkan();
        mantra3.efek();
    }
}

/*  Pertanyaan 
1. Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung?
Coba dan jelaskan errornya.
Jawab: Hasilnya Error 
UjiAbrak.java:22: error: MantraAbstrak is abstract; cannot be instantiated
        MantraAbstrak m = new MantraAbstrak("Test");
Karena abstract class itu belum lengkap ada method efek() yang belum punya isi. Java gak mau bikin objek dari kelas yang belum lengkap.

2. Mengapa kita perlu membuat abstract class? Apa keuntungannya?
Jawab: Untuk mengimplementasikan method tertentu (kontrak). Jadi semua mantra pasti punya efek().
Menyediakan kerangka umum (nama, method ucapkan()) yang bisa dipakai semua subclass tanpa ditulis ulang.
kita bisa simpan berbagai mantra dalam List<MantraAbstrak> dan panggil efek() seragam.
Mencegah instansiasi kelas yang belum lengkap, sehingga desain lebih aman.
*/
