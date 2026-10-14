/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL
// Minggu : 5 sesi 3

import java.util.ArrayList;
import java.util.List;

// 1. Abstract class MantraPerlindungan
abstract class MantraPerlindungan {
    private String nama;                        // nama mantra

    public MantraPerlindungan(String nama) {    // isi nama mantra
        this.nama = nama;
    }

    public String getNama() {                   // ambil nama mantra
        return nama;
    }

    // Method abstract: wajib diisi sama class anak
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// 2a. Protego
class Protego extends MantraPerlindungan {
    public Protego() {                          // kasih nama "Protego"
        super("Protego");
    }

    @Override
    public void aktifkan() {                    // kalau dinyalakan
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {                 // kalau dimatikan
        System.out.println("Perisai Protego menghilang.");
    }
}

// 2b. Fidelius
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;    // orang yang jaga rahasia

    public Fidelius(String secretKeeper) {  // simpan nama penjaga rahasia
        super("Fidelius");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {   // kalau dinyalakan
        System.out.println("Mantra Fidelius diaktifkan. Secret Keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {  // kalau dimatikan
        System.out.println("Mantra Fidelius dinonaktifkan.");
    }
}

// 2c. MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {
    private String area;    // area yang diblokir

    public MantraAntiApparition(String area) {  // simpan nama area
        super("MantraAntiApparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {    // kalau dinyalakan
        System.out.println("Apparition diblokir di area: " + area);
    }

    @Override
    public void nonaktifkan() {  // kalau dimatikan
        System.out.println("Apparition kembali diizinkan di area: " + area);
    }
}

// 3. Kelas SistemPertahanan
class SistemPertahanan {
    private String namaSistem;  // nama sistem
    private List<MantraPerlindungan> daftarMantra; // tempat nyimpan mantra

    public SistemPertahanan(String namaSistem) {  // bikin sistem baru
        this.namaSistem = namaSistem;
        this.daftarMantra = new ArrayList<>();   // list awalnya kosong
    }

    public void tambahMantra(MantraPerlindungan mantra) { // masukin mantra ke list
        daftarMantra.add(mantra);
        System.out.println("Mantra " + mantra.getNama() + " ditambahkan ke " + namaSistem);
    }

    public void aktifkanSemuaMantra() {  // nyalain semua mantra
        System.out.println("\n=== Mengaktifkan semua mantra di " + namaSistem + " ===");
        if (daftarMantra.isEmpty()) {    // kalau list kosong
            System.out.println("Belum ada mantra yang terpasang.");
            return;
        }
        for (MantraPerlindungan m : daftarMantra) {  // jalanin satu-satu
            m.aktifkan();        // panggil aktifkan() versinya sendiri
        }
        System.out.println("=== Semua mantra aktif ===\n");
    }

    public void nonaktifkanSemuaMantra() {   // matiin semua mantra
        System.out.println("\n=== Menonaktifkan semua mantra di " + namaSistem + " ===");
        if (daftarMantra.isEmpty()) {      // kalau list kosong
            System.out.println("Belum ada mantra yang terpasang.");
            return;
        }
        for (MantraPerlindungan m : daftarMantra) {     // jalanin satu-satu
            m.nonaktifkan();    // panggil nonaktifkan() versinya sendiri
        }
        System.out.println("=== Semua mantra nonaktif ===\n");
    }
}

// 4. Kelas utama
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwarts = new SistemPertahanan("Sistem Pertahanan Hogwarts"); // bikin sistem

        MantraPerlindungan protego = new Protego();      // bikin mantra Protego
        MantraPerlindungan fidelius = new Fidelius("Dumbledore");   // bikin mantra Fidelius
        MantraPerlindungan antiApparition = new MantraAntiApparition("Gerbang Utama"); // bikin mantra AntiApparition

        hogwarts.tambahMantra(protego);   // masukin Protego
        hogwarts.tambahMantra(fidelius);  // masukin Fidelius
        hogwarts.tambahMantra(antiApparition);  // masukin AntiApparition

        hogwarts.aktifkanSemuaMantra();  // nyalain semua
        hogwarts.nonaktifkanSemuaMantra();  // matiin semua
    }
}
