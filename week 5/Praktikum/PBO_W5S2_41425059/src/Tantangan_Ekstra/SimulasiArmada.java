/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan_Ekstra;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

// Class utama buat nunjukin polimorfisme lewat array
public class SimulasiArmada {

    public static void main(String[] args) {

        // Bikin array bertipe parent class
        // Isinya objek-objek dari child class yang berbeda
        KendaraanEkspedisi[] armada = new KendaraanEkspedisi[3];
        armada[0] = new TrukBox("B 9081 TXT", 5000);
        armada[1] = new MobilVan("B 1122 KAA", 800);
        armada[2] = new TrukBox("B 7777 XYZ", 3000);

        // Satu for-loop buat semua objek
        // Nggak perlu cek satu-satu jenisnya, Java yang urus
        for (KendaraanEkspedisi k : armada) {
            k.infoKendaraan();        // method warisan dari parent
            k.angkutBarang("Paket");  // method override dari child
            System.out.println();
        }
    }
}


/*Lembar Analisis Abstraksi:
 Eksperimen 1: Pada class SimulasiAbstraksi, buka komentar (uncomment) 
pada baris PERCOBAAN 1: KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100); 
Pertanyaan: Salin pesan error yang dihasilkan oleh Java. Mengacu pada "Kotak Insight Konsep" yang sudah Anda baca, mengapa Java menggagalkan baris kode ini?

Jawab: 


Eksperimen 2: Buatlah sebuah class baru dengan nama MotorKurir yang melakukan extends ke KendaraanEkspedisi, tetapi jangan menuliskan isi method angkutBarang() di dalamnya. 
Pertanyaan: Arahkan kursor (hover) ke garis merah error pada tulisan class MotorKurir.
Tuliskan dua opsi solusi/perbaikan yang ditawarkan oleh IDE Java (seperti NetBeans/IntelliJ/Eclipse) untuk mengatasi error tersebut!

Jawab: 
*/