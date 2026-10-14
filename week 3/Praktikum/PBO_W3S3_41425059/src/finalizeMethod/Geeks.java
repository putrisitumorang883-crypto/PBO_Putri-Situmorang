/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalizeMethod;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Geeks {
     public static void main(String[] args) {

        // Membuat object Geeks.
        Geeks t = new Geeks();

        // Menampilkan hash code dari object.
        System.out.println(t.hashCode());

        // Menghilangkan referensi object.
        t = null;

        // Meminta JVM menjalankan Garbage Collector.
        System.gc();

        // Menampilkan pesan akhir program.
        System.out.println("end");
    }

    @Override
    protected void finalize()
    {
        // Menampilkan pesan ketika finalize() dipanggil.
        System.out.println("finalize method called");
    }
}
