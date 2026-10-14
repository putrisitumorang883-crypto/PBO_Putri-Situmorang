/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objek_menngunakan_Reflection;
//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 
class Student {
      public Student() {} // Konstruktor default
}

public class Main {
    public static void main(String[] args) {
        try {
            // Memanggil kelas Student berdasarkan nama
            Class<?> c = Class.forName("Student");

            // Membuat objek Student secara dinamis
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();

            // Menampilkan objek yang berhasil dibuat
            System.out.println("Object created: " + s2);

        } catch (ClassNotFoundException e) {
            // Kelas Student tidak ditemukan
            System.err.println("Class not found!");

        } catch (NoSuchMethodException e) {
            // Konstruktor default tidak ditemukan
            System.err.println("No default constructor!");

        } catch (Exception e) {
            // Menampilkan kesalahan lainnya
            e.printStackTrace();
        }
    }
}
