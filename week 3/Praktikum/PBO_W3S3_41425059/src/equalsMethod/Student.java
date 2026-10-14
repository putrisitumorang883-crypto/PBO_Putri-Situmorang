/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equalsMethod;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

public class Student {
   // Menyimpan nomor roll mahasiswa.
    int roll;

    @Override
    public boolean equals(Object o) {

        // Memeriksa apakah object yang dibandingkan merupakan Student.
        if (o instanceof Student) {

            // Membandingkan nilai roll dari kedua object.
            return this.roll == ((Student) o).roll;
        }

        // Mengembalikan false jika object bukan Student.
        return false;
    }

    public static void main(String[] args) {

        // Membuat object Student pertama.
        Student s1 = new Student();
        s1.roll = 101;

        // Membuat object Student kedua dengan roll yang sama.
        Student s2 = new Student();
        s2.roll = 101;

        // Membuat object Student ketiga dengan roll berbeda.
        Student s3 = new Student();
        s3.roll = 102;

        // Membandingkan s1 dengan s2.
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        // Membandingkan s1 dengan s3.
        System.out.println("s1.equals(s3): " + s1.equals(s3));
    } 
}
