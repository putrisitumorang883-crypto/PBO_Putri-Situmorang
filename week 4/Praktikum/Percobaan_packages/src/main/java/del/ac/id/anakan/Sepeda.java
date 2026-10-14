/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package del.ac.id.anakan;
// Nama : Putri Yuni Br Situmorang
// Nim  : 41425059
// Prodi: D-IV TRPL
// Import kelas induk

import del.ac.id.induk.Kendaraan;

// Inheritance: Sepeda mewarisi sifat Kendaraan
public class Sepeda extends Kendaraan {

    // Constructor
    public Sepeda() {
    }

    // Override: jika parameter 0, percepatan default 10 km/jam
    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        if (jlhTorsi == 0 || panjangGagang == 0 || rasioGigi == 0) {
            return (float) 10.0;
        } else {
            return jlhTorsi * panjangGagang * rasioGigi;
        }
    }

    // Override: tampilkan informasi sepeda
    @Override
    public void cetakInformasi(Object o) {
        System.out.println("==============");
        System.out.println(String.format("Sepeda saya berwarna %s.",
                ((Sepeda) o).getWarnaKendaraan()));
        System.out.println(String.format("Dimensi sepeda tersebut adalah %d meter persegi",
                ((Sepeda) o).getDimensiKendaraan()));
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.",
                kalkulasiPercepatan(0, 0, 0)));
        System.out.println(String.format("Sepeda tersebut memiliki %d kaca spion dan %d roda. ",
                ((Sepeda) o).getJlhSpion(), ((Sepeda) o).getJlhRoda()));
        System.out.println("==============");
    }
}