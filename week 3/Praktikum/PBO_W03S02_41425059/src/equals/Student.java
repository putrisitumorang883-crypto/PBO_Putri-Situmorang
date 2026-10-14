/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equals;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Student {
    int roll; // atribut nomor absen/roll mahasiswa
 
    // Meng-override method equals() bawaan dari class Object

    @Override
    public boolean equals(Object o) {
        // instanceof: memastikan objek o memang bertipe Student
        // sebelum di-cast, agar tidak error ClassCastException
        if (o instanceof Student) {
            return this.roll == ((Student) o).roll;
        }
        return false; // jika bukan Student, langsung dianggap tidak sama
    }
 
    public static void main(String[] args) {
        // Membuat objek s1 dengan roll = 101
        Student s1 = new Student();
        s1.roll = 101;
 
        // Membuat objek s2 dengan roll = 101 (sama dengan s1)
        Student s2 = new Student();
        s2.roll = 101;
 
        // Membuat objek s3 dengan roll = 102 (berbeda)
        Student s3 = new Student();
        s3.roll = 102;
 
        // Membandingkan objek pakai equals() yang sudah di-override
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true, roll sama
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false, roll beda
    }
}

