/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objek_denganClonemethod;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Geeks implements Cloneable {
   // method 1: meng-override clone() bawaan dari class Object
    @Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        // super.clone() memanggil clone() milik parent class (Object)
        // untuk membuat dan mengembalikan salinan objek saat ini
        return super.clone();
    }

    String name = "GeeksForGeeks"; // atribut instance dengan nilai awal

    // Method 2: main() sebagai titik masuk program
    public static void main(String[] args)
    {
        // Membuat objek asli o1
        Geeks o1 = new Geeks();

        try {
            // Membuat objek o2 sebagai salinan (clone) dari o1
            // hasil clone() perlu di-cast ke tipe Geeks
            Geeks o2 = (Geeks)o1.clone();
            System.out.println(o2.name); // mencetak atribut hasil salinan
        }
        // clone() bisa melempar CloneNotSupportedException, wajib ditangani
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    } 
}
