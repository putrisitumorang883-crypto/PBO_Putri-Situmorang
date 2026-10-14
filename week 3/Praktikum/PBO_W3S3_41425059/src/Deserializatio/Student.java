/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deserializatio;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

import java.io.Serializable;

// Class Student digunakan sebagai object yang akan disimpan.
public class Student implements Serializable {

    // Menyimpan nama mahasiswa.
    String name;

    // Constructor untuk mengisi nama mahasiswa.
    public Student(String name) {
        this.name = name;
    }

    // Menampilkan data Student.
    @Override
    public String toString() {
        return "Student: " + name;
    }
}