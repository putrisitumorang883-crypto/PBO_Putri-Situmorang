/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wait_Notif_Notifall;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL

class AntreanShared {

    // Menyimpan data pesan.
    private String data;

    // Menentukan apakah data sudah tersedia.
    private boolean adaData = false;

    // Method untuk mengirim pesan.
    public synchronized void kirimPesan(String pesan) {

        while (adaData) {
            try {

                // Menunggu sampai pesan sebelumnya diambil.
                wait();

            } catch (InterruptedException e) {

                // Menghentikan status interrupt thread.
                Thread.currentThread().interrupt();
            }
        }

        // Menyimpan pesan yang dikirim.
        this.data = pesan;

        // Menandakan bahwa data sudah tersedia.
        this.adaData = true;

        System.out.println("Pesan dikirim: " + pesan);

        // Memberitahu thread lain bahwa data sudah tersedia.
        notify();
    }

    // Method untuk mengambil pesan.
    public synchronized String ambilPesan() {

        while (!adaData) {
            try {

                // Menunggu sampai pesan tersedia.
                wait();

            } catch (InterruptedException e) {

                // Menghentikan status interrupt thread.
                Thread.currentThread().interrupt();
            }
        }

        // Menandakan bahwa data sudah diambil.
        this.adaData = false;

        System.out.println("Pesan diterima: " + data);

        // Memberitahu thread lain bahwa data sudah kosong.
        notify();

        return data;
    }
}
    

