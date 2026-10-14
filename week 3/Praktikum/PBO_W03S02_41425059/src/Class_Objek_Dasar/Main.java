/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Objek_Dasar;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

class Student {
    int id;    // atribut id bertipe int
    String n;  // atribut n (nama) bertipe String

    // Constructor: dipanggil otomatis saat objek Student dibuat dengan operator new
    
    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Student bernama s1, langsung mengisi atribut
        // lewat constructor: id = 10, n = "Alice"
        Student s1 = new Student(10, "Alice");

        // Mencetak nilai atribut objek s1
        System.out.println(s1.id); // menampilkan 10
        System.out.println(s1.n);  // menampilkan Alice
    }
}

