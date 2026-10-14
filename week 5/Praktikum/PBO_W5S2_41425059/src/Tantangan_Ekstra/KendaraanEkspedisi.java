/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan_Ekstra;



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

    // Concrete method: udah ada isinya, bisa langsung dipakai anak
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


