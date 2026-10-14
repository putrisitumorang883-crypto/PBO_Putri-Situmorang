/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package del.ac.id.main;

// Nama : Putri Yuni Br Situmorang
// Nim  : 41425059
// Prodi: D-IV TRPL

// Import kelas-kelas turunan dari package anakan
import del.ac.id.anakan.Motor;
import del.ac.id.anakan.Mobil;
import del.ac.id.anakan.Sepeda;

// Kelas utama untuk menjalankan program
public class Percobaan_packages {

    // Method main: titik masuk program
    public static void main(String[] args) {

        // Membuat dan mengisi objek Motor
        Motor objMotor = new Motor();
        objMotor.setDimensiKendaraan(274);
        objMotor.setJlhRoda(2);
        objMotor.setJlhSpion(2);
        objMotor.setWarnaKendaraan("Hitam");
        objMotor.setJlhTorsi(1);
        objMotor.setPanjangGagang((float) 15.5);
        objMotor.setRasioGigi((float) 4.2);
        objMotor.setFaktorPembagi(2);

        // Membuat dan mengisi objek Mobil
        Mobil objMobil = new Mobil();
        objMobil.setDimensiKendaraan(632);
        objMobil.setJlhRoda(4);
        objMobil.setJlhSpion(2);
        objMobil.setWarnaKendaraan("Grey");
        objMobil.setJlhTorsi(1);
        objMobil.setPanjangGagang((float) 20.5);
        objMobil.setRasioGigi((float) 50.4);
        objMobil.setFaktorPembagi(3);

        // Membuat dan mengisi objek Sepeda
        Sepeda objSepeda = new Sepeda();
        objSepeda.setDimensiKendaraan(24);
        objSepeda.setJlhRoda(2);
        objSepeda.setJlhSpion(0);
        objSepeda.setWarnaKendaraan("Putih");

        // Menampilkan informasi tiap kendaraan
        objMotor.cetakInformasi(objMotor);
        objMobil.cetakInformasi(objMobil);
        objSepeda.cetakInformasi(objSepeda);
    }
}