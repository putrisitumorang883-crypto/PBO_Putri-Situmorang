/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wait_Notif_Notifall;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL

public class MainConcurrency {

    public static void main(String[] args) {

        // Membuat antrean yang digunakan bersama oleh thread.
        AntreanShared antrean = new AntreanShared();

        // Membuat thread produsen.
        Thread produsen = new Thread(() -> {

            // Daftar pesan yang akan dikirim.
            String[] listPesan = {"Halo", "Belajar Java", "Selesai"};

            // Mengirim setiap pesan.
            for (String p : listPesan) {
                antrean.kirimPesan(p);
            }
        });

        // Membuat thread konsumen.
        Thread konsumen = new Thread(() -> {

            // Mengambil tiga pesan dari antrean.
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan();
            }
        });

        // Menjalankan thread produsen.
        produsen.start();

        // Menjalankan thread konsumen.
        konsumen.start();
    }
}
    

