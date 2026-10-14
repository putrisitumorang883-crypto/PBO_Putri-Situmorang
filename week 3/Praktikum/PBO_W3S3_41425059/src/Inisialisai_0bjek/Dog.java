/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inisialisai_0bjek;

// Nama : Putri Yuni Br Situmorang
// Nim  : 41425059 
// Prodi : D-IV TRPL
public class Dog {
  // Atribut (instance variable) milik class Dog
    String name;
    String breed;
    int age;
    String color;
 
    // Constructor: dipanggil otomatis saat objek Dog dibuat dengan operator new
    public Dog(String name, String breed, int age,
               String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // method 1: getter untuk mengambil nilai atribut name
    public String getName() {
        return name;
    }
 
    // method 2: getter untuk mengambil nilai atribut breed
    public String getBreed() {
        return breed;
    }
 
    // method 3: getter untuk mengambil nilai atribut age
    public int getAge() {
        return age;
    }
 
    // method 4: getter untuk mengambil nilai atribut color
    public String getColor() {
        return color;
    }
 
    // toString() di-override agar saat objek dicetak,
    @Override public String toString()
    {
        return ("Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }
 
    public static void main(String[] args)
    {
        // Membuat objek Dog bernama tuffy, atribut langsung
        // diisi lewat constructor: name="tuffy", breed="papillon", age=5, color="white"
        Dog tuffy
            = new Dog("tuffy", "papillon", 5, "white");

        // untuk mencetak seluruh informasi objek tuffy
        System.out.println(tuffy.toString());
    }
}
