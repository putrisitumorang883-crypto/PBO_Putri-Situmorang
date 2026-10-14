/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finalize;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Geeks {
    public static void main(String[] args) {
 
        // Membuat objek Geeks bernama t
        Geeks t = new Geeks();
        System.out.println(t.hashCode()); // mencetak hash code default objek t
 
        // Menghapus referensi ke objek t (t sekarang menunjuk ke null)
        t = null;

        // (hanya permintaan, JVM tidak wajib langsung menjalankannya)
        System.gc();
 
        System.out.println("end");
    }
 
    // finalize() dipanggil oleh Garbage Collector tepat sebelum objek
    @Override protected void finalize()
    {
        System.out.println("finalize method called");
    }
}

