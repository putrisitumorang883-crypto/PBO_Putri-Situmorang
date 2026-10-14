/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2_1;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

// abstract class = cetak biru yang belum lengkap
abstract class KendaraanEkspedisi {

    // Atribut yang bakal diwariskan ke anak
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor buat set atribut
    // Dipanggil anak lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Concrete method, udah ada isinya, bisa langsung dipakai anak
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi
                + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method: belum ada isinya, wajib diimplementasi anak
    public abstract void angkutBarang(String namaBarang);
}

// Child class konkret: wajib implementasi angkutBarang()
class TrukBox extends KendaraanEkspedisi {

    // Constructor: panggil constructor parent pakai super()
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi abstract method angkutBarang() versi truk
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat " + namaBarang
                + " ke dalam kontainer tertutup pendingin.");
    }
}

// Child class konkret: wajib implementasi angkutBarang()
class MobilVan extends KendaraanEkspedisi {

    // Constructor: panggil constructor parent pakai super()
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi abstract method angkutBarang() versi mobil van
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat " + namaBarang
                + " di bagasi belakang untuk distribusi kota.");
    }
}


// Class utama buat nyoba abstract class
public class SimulasiAbstraksi {

    public static void main(String[] args) {

        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: ini bakal error kalau di-uncomment
        // Error: KendaraanEkspedisi is abstract; cannot be instantiated
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: bikin objek dari child konkret
        // TrukBox itu konkret, jadi boleh di-new
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();                // method warisan dari parent
        fuso.angkutBarang("20 Unit Kulkas"); // method override dari child

        System.out.println("-------------------------------");

        // MobilVan juga konkret, boleh di-new
        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}


/* Lembar Analisis Abstraksi:
Eksperimen 1: Pada class SimulasiAbstraksi, buka komentar (uncomment) pada baris
PERCOBAAN 1: KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
Pertanyaan: Salin pesan error yang dihasilkan oleh Java. Mengacu pada "Kotak Insight Konsep"
yang sudah Anda baca, mengapa Java menggagalkan baris kode ini?

Jawab:

Pesan Errornya yaitu: Exception in thread "main" java.lang.RuntimeException: Uncompilable code - Bagian2_1.KendaraanEkspedisi is abstract; cannot be instantiated
at Bagian2_1.SimulasiAbstraksi.main(SimulasiAbstraksi.java:1)
C:\Users\USER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\USER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 2 seconds)

Java mengagalkan baris kode ini karena KendaraanEkspedisi adalah abstract class 
cetak biru yang belum lengkap. Di dalamnya masih ada method angkutBarang() yang belum ada isinya (abstract method, cuma deklarasi tanpa body).
Java nggak bisa membuat objek dari class yang belum lengkap, karena jika objek tersebut memanggil angkutBarang(), tidak ada kode yang bisa dijalankan.

Eksperimen 2: Buatlah sebuah class baru dengan nama MotorKurir yang melakukan extends ke
KendaraanEkspedisi, tetapi jangan menuliskan isi method angkutBarang() di dalamnya.
Pertanyaan: Arahkan kursor (hover) ke garis merah error pada tulisan class MotorKurir.
Tuliskan dua opsi solusi/perbaikan yang ditawarkan oleh IDE Java (seperti
NetBeans/IntelliJ/Eclipse) untuk mengatasi error tersebut!

Jawab: 

Pesan Error di hover:  MotorKurir is not abstract and does not override abstract method angkutBarang(String) in KendaraanEkspedisi
Dua Perbaikan yaitu
1."Implement all abstract methods", IDE otomatis menambahkan method angkutBarang() kosong di dalam MotorKurir, sehingga class tersebut menjadi konkret dan bisa dinew.
Programmer tinggal mengisi body method-nya.

2. "Make MotorKurir abstract" ,IDE mengubah deklarasi class menjadi abstract class MotorKurir, 
sehingga tanggung jawab mengimplementasikan angkutBarang() dilimpahkan ke subclass berikutnya.
*/