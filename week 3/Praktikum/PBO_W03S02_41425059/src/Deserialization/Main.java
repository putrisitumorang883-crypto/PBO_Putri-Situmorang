/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deserialization;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args)
    {
        // ===== Serialization =====
        // Menyimpan objek Student ke dalam file "student.ser"
        // try-with-resources: stream otomatis ditutup setelah blok try selesai
        try (ObjectOutputStream out
             = new ObjectOutputStream(
                 new FileOutputStream("student.ser"))) {
            // writeObject() menulis objek Student ke dalam file
            out.writeObject(new Student("Alice"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    // Membaca kembali objek Student dari file "student.ser"
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            // readObject() mengembalikan objek Object, perlu di-cast ke Student
            Student s = (Student)in.readObject();
            System.out.println(s); // memanggil toString() milik Student
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}