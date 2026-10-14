/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashCode;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Student {
    int roll; // atribut nomor absen/roll mahasiswa
 
    // Meng-override method hashCode() bawaan dari class Object
    @Override
    public int hashCode() {
        return roll;
    }
 
    public static void main(String[] args) {
        // Membuat objek s1 dengan roll = 101
        Student s1 = new Student();
        s1.roll = 101;
 
        // Membuat objek s2 dengan roll = 102
        Student s2 = new Student();
        s2.roll = 102;
 
        // Mencetak hashCode masing-masing objek
        // karena sudah di-override, hasilnya akan sama dengan nilai roll
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}
