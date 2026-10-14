/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterdanSetterContoh1;

//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPl

class ObjectPassDemo {

    int a, b;

    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }

    // Method untuk membandingkan dua object.
    boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}

public class Main {

    public static void main(String[] args) {

        // Membuat object pertama.
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);

        // Membuat object kedua dengan nilai yang sama.
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);

        // Membuat object ketiga dengan nilai berbeda.
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        // Membandingkan object pertama dan kedua.
        System.out.println("ob1 == ob2: "
                + ob1.equalTo(ob2));

        // Membandingkan object pertama dan ketiga.
        System.out.println("ob1 == ob3: "
                + ob1.equalTo(ob3));
    }
}
  
