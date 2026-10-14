/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Copy_Construct;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL

public class Main {

    public static void main(String[] args) {

        // Menampilkan informasi object pertama.
        System.out.println("First Object");

        // Membuat object pertama menggunakan parameterized constructor.
        Geeks geek1 = new Geeks("Sweta", 68);

        // Menampilkan data object pertama.
        System.out.println("GeekName: " + geek1.name
                + " and GeekId: " + geek1.id);

        System.out.println();

        // Membuat object kedua dengan copy constructor.
        Geeks geek2 = new Geeks(geek1);

        // Menampilkan informasi object kedua.
        System.out.println("Copy Constructor used Second Object");

        // Menampilkan data hasil salinan.
        System.out.println("GeekName: " + geek2.name
                + " and GeekId: " + geek2.id);
    }
}
    

