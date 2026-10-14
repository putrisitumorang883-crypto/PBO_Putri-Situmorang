/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toStringmethod;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Student {
     @Override
    public String toString() { // memberikan representasi object dalam bentuk String
        return "Student object"; // menentukan teks yang akan dikembalikan
    }

    public static void main(String[] args) {

        Student s = new Student(); // membuat objek Student

        System.out.println(s.toString()); // memanggil toString()
    }
}
