/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package del.ac.id.induk;

// Nama : Putri Yuni Br Situmorang
// Nim  : 41425059
// Prodi: D-IV TRPL

// Kelas induk yang mengimplementasikan interface IKendaraan
public class Kendaraan implements IKendaraan {

    // Encapsulation: atribut private, hanya bisa diakses lewat getter/setter
    private int jlhRoda, dimensiKendaraan, jlhSpion;
    private String warnaKendaraan;

    // Constructor kosong
    public Kendaraan() {
    }

    // Implementasi setter dari interface
    @Override
    public void setJlhRoda(int value) {
        jlhRoda = value;
    }

    @Override
    public void setDimensiKendaraan(int value) {
        dimensiKendaraan = value;
    }

    @Override
    public void setJlhSpion(int value) {
        jlhSpion = value;
    }

    @Override
    public void setWarnaKendaraan(String value) {
        warnaKendaraan = value;
    }

    // Method dasar: hanya cek apakah objek null
    @Override
    public void cetakInformasi(Object o) {
        if (o == null) {
            System.out.println("Object is Null");
        }
    }

    // Implementasi getter dari interface
    @Override
    public int getJlhRoda() {
        return jlhRoda;
    }

    @Override
    public int getDimensiKendaraan() {
        return dimensiKendaraan;
    }

    @Override
    public int getJlhSpion() {
        return jlhSpion;
    }

    @Override
    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    // Perhitungan percepatan dasar
    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return jlhTorsi * panjangGagang * rasioGigi;
    }
}

