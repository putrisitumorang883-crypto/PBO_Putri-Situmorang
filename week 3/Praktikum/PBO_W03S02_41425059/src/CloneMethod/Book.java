/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CloneMethod;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Book  implements Cloneable{
    private String t;

    // Konstruktor untuk inisialisasi judul buku[cite: 2]
    public Book(String t) { 
        this.t = t;
    }

    // Meng-override method clone() untuk membuat duplikat objek[cite: 2]
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Method getter untuk mengambil judul buku[cite: 2]
    public String getTitle() { 
        return t;
    }

    public static void main(String[] args) {
        try {
            // Membuat objek buku asli[cite: 2]
            Book b1 = new Book("Java Basics"); 
            
            // Mengkloning objek b1 menjadi b2[cite: 2]
            Book b2 = (Book) b1.clone(); 

            // Menampilkan judul dari kedua objek buku[cite: 2]
            System.out.println("Judul buku b1: " + b1.getTitle()); 
            System.out.println("Judul buku b2: " + b2.getTitle()); 
            
            // Mengecek referensi memori: hasilnya false karena b1 dan b2 adalah dua objek terpisah[cite: 2]
            System.out.println("Apakah b1 dan b2 objek yang sama? " + (b1 == b2)); 

        } catch (CloneNotSupportedException e) {
            // Menangani exception jika penanganan kloning gagal/tidak didukung[cite: 2]
            e.printStackTrace(); 
        }
    }
}
