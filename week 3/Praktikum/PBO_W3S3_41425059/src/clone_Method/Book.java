/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clone_Method;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL

   public class Book implements Cloneable {

    // Menyimpan judul buku.
    private String t;

    // Constructor untuk mengisi judul buku.
    public Book(String t) {
        this.t = t;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        // Membuat salinan object Book.
        return super.clone();
    }

    // Mengambil judul buku.
    public String getTitle() {
        return t;
    }

    public static void main(String[] args) {
        try {

            // Membuat object Book pertama.
            Book b1 = new Book("Java Basics");

            // Membuat salinan dari object b1.
            Book b2 = (Book) b1.clone();

            // Menampilkan judul buku pertama.
            System.out.println("Judul buku 1: " + b1.getTitle());

            // Menampilkan judul buku kedua.
            System.out.println("Judul buku 2: " + b2.getTitle());

            // Membandingkan apakah b1 dan b2 adalah object yang sama.
            System.out.println("Apakah b1 dan b2 object yang sama? " + (b1 == b2));

        } catch (CloneNotSupportedException e) {

            // Menampilkan error jika cloning tidak didukung.
            e.printStackTrace();
        }
    }
}

