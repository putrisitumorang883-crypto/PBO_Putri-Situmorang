/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toString_Method;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Student {
    // Meng-override method toString() bawaan dari class Object
    // agar representasi String objek ini lebih jelas (bukan Student@hashcode)
    @Override
    public String toString() {
        return "Student object";
    }

    public static void main(String[] args) {
        Student s = new Student();        // membuat objek Student
        System.out.println(s.toString()); // memanggil toString()
    }
}
