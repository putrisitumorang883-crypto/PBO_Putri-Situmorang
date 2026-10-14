/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashCodeMethod;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Student {

    // Menyimpan nomor roll.
    int roll;

    @Override
    public int hashCode() {

        // Mengembalikan nilai roll sebagai hash code.
        return roll; // menyimpan nomor roll.
    }

    public static void main(String[] args) {

        // Membuat object Student pertama.
        Student s1 = new Student();
        s1.roll = 101; // memberi nilai roll pada object pertama

        // Membuat object Student kedua.
        Student s2 = new Student();
        s2.roll = 102; // memberi nilai roll pada object kedua

        // Menampilkan hash code masing-masing object.
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}

