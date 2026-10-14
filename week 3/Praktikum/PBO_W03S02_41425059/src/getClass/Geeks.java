/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getClass;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Geeks {
    public static void main(String[] args)
    {
        // Objek bertipe String disimpan dalam referensi bertipe Object (polimorfisme)
        Object o = new String("GeeksForGeeks");
        
        // Mengambil tipe kelas runtime sebenarnya dari objek o
        Class c = o.getClass();
        
        // Menampilkan nama kelas objek (output: java.lang.String)
        System.out.println("Class of Object o is: " 
                            + c.getName());
    }
}

