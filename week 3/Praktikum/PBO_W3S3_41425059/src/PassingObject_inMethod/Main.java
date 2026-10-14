/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassingObject_inMethod;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPl


class ObjectPassDemo {

    // Menyimpan dua nilai integer.
    int a, b;

    // Constructor untuk mengisi nilai a dan b.
    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }

    // Membandingkan nilai a dan b dengan object lain.
    boolean equalTo(ObjectPassDemo o) {

        // Mengembalikan true jika a dan b kedua object sama.
        return (o.a == a && o.b == b);
    }
}

public class Main {

    public static void main(String[] args) {

        // Membuat object pertama dengan nilai 100 dan 22.
        ObjectPassDemo obj1 = new ObjectPassDemo(100, 22);

        // Membuat object kedua dengan nilai yang sama.
        ObjectPassDemo obj2 = new ObjectPassDemo(100, 22);

        // Membuat object ketiga dengan nilai berbeda.
        ObjectPassDemo obj3 = new ObjectPassDemo(-1, -1);

        // Membandingkan object pertama dengan object kedua.
        System.out.println("obj1 == obj2: "
                + obj1.equalTo(obj2));

        // Membandingkan object pertama dengan object ketiga.
        System.out.println("obj1 == obj3: "
                + obj1.equalTo(obj3));
    }
}

