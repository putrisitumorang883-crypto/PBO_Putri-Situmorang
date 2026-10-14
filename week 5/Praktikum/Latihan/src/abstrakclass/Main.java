/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakclass;

/**
 *
 * @author USER
 */
abstract class Animal {
    abstract void suara ();
    
    void tidur () {
            System.out.println("Hewan tidur");
    }
}

class Kucing extends Animal {
    void suara () {
        System.out.println("Meong");
    }
}


public class Main {
    public static void main(String[] args) {
         Animal a = new Kucing();
         a.suara();
         a. tidur ();
        
    }
}