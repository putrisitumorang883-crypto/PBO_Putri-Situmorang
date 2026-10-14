/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getClassMethod;
//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Geeks {
     public static void main(String[] args) {

        // Membuat object String.
        Object o = new String("GeeksForGeeks");

        // Mendapatkan class dari object o.
        Class c = o.getClass();

        // Menampilkan nama class dari object tersebut.
        System.out.println("Class of Object o is: "
                + c.getName());
    }
}
