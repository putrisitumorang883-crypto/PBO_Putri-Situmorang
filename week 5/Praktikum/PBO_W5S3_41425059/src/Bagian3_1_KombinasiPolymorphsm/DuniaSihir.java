/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian3_1_KombinasiPolymorphsm;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL
// Minggu : 5 sesi 3

import java.util.ArrayList;
import java.util.List;

// Abstract class Mantra, kerangka untuk semua jenis mantra
abstract class Mantra {
    private String nama;   // nama mantra

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getName() {
        return nama;
    }

    // Abstract method: wajib diimplementasikan subclass
    public abstract void efek();
}

// Subclass 1: Expelliarmus
class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

// Subclass 2 ExpectoPatronum
class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

// Subclass 3: Lumos
class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Kelas Penyihir: punya daftar mantra yang sudah dipelajari
class Penyihir {
    private String nama;
    private List<Mantra> mantralist;   // polymorphism: list bertipe Mantra

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantralist = new ArrayList<>();
    }

    // Method untuk menambah mantra ke daftar
    public void belajarMantra(Mantra mantra) {
        mantralist.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getName());
    }

    // Method untuk mengucapkan satu mantra berdasarkan nama
    public void ucapkanMantra(String namaMantra) {
        // Cari mantra di dalam list
        for (Mantra mantra : mantralist) {
            if (mantra.getName().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getName());
                mantra.efek();   // polymorphism: efek sesuai objek asli
                return;
            }
        }
        // Kalau tidak ketemu
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // TUGAS: method untuk mengucapkan SEMUA mantra yang sudah dipelajari
    public void ucapkanSemuaMantra() {
        System.out.println("\n=== " + nama + " mengucapkan semua mantra ===");
        if (mantralist.isEmpty()) {
            System.out.println(nama + " belum belajar mantra apapun.");
            return;
        }
        // Loop semua mantra, panggil efek()-nya
        for (Mantra mantra : mantralist) {
            System.out.println(nama + " mengucapkan: " + mantra.getName());
            mantra.efek();
        }
        System.out.println("=== Selesai ===\n");
    }
}

// Kelas utama
public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");

        // Buat objek mantra
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        // Harry belajar dua mantra
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        // Coba ucapkan mantra
        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos");   // belum belajar

        // Tambahkan Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        // Panggil method baru  ucapkan semua mantra
        harry.ucapkanSemuaMantra();
    }
}


/* Pertanyaan:
1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
Jawab: 
Mantra adalah abstract class → tidak bisa diinstansiasi, tapi bisa jadi tipe variabel dan elemen list.
List<Mantra> mantralist bisa menampung Expelliarmus, ExpectoPatronum, Lumos, semua subclass.
Saat mantra.efek() dipanggil, Java otomatis pilih implementasi sesuai objek asli (dynamic dispatch). 
Abstract class menyediakan kontrak (efek()) dan bagian umum (getName()), jadi kode Penyihir gak perlu tahu detail tiap mantra.


2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah
kelas Penyihir? Apakah mudah? Mengapa?
Jawab: Cukup mudah karena, Penyihir hanya bergantung pada abstraksi Mantra, bukan pada kelas konkret.
Ini disebut Open/Closed Principle terbuka untuk ekstensi, tertutup untuk modifikas */