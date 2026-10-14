/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objek_dengan_Method;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 


public class Geeks {
    // Atribut static dimiliki bersama oleh class (bukan per objek)
    static String name;
    static float price;

    // Method static untuk mengatur (set) nilai atribut name dan price
    static void set(String n, float p) {
        name = n;
        price = p;
    }

    // Method static untuk menampilkan (get) nilai atribut name dan price
    static void get()
    {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String args[])
    {
        // Memanggil method set() langsung lewat nama class Geeks
        Geeks.set("Visual studio", 0.0f);

        // Memanggil method get() untuk menampilkan nilai atribut yang sudah diisi
        Geeks.get();
    }
}

