/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menggunakan_Clone_Method;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Geeks implements Cloneable {

    @Override //method 1
    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();// Super() mengacu ke parent class
    }

    String name = "GeeksForGeeks"; // menyimpan nama object.

    public static void main(String args[]) // Method 2
    {
        Geeks o1 = new Geeks(); //membuat object pertama

        try {
            Geeks o2 = (Geeks)o1.clone(); // membuat object kedua sebagai salinan dari o1.

            System.out.println(o2.name); // menampilkan nama dari object hasil cloning.
        }
        catch (CloneNotSupportedException e) // menangani jika proses cloning tidak didukung.
        {
            e.printStackTrace();
        }
    }
}
