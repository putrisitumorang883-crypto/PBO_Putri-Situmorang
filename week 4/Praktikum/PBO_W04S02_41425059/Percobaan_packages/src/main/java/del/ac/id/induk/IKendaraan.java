/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package del.ac.id.induk;
// Nama : Putri Yuni Br Situmorang
// Nim  : 41425059
// Prodi: D-IV TRPL


// Interface kontrak method yang wajib dimiliki semua kendaraan
public interface IKendaraan {

    // Setter: untuk mengisi nilai atribut
    void setJlhRoda(int value);
    void setDimensiKendaraan(int value);
    void setJlhSpion(int value);
    void setWarnaKendaraan(String value);

    // Untuk menampilkan informasi kendaraan
    void cetakInformasi(Object o);

    // Getter: untuk mengambil nilai atribut
    int getJlhRoda();
    int getDimensiKendaraan();
    int getJlhSpion();
    String getWarnaKendaraan();

    // Menghitung percepatan kendaraan
    float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi);
}