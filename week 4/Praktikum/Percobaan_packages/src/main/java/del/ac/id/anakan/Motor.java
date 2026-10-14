/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package del.ac.id.anakan;

// Nama : Putri Yuni Br Situmorang
// Nim  : 41425059
// Prodi: D-IV TRPL

// Import kelas induk dari package lain
import del.ac.id.induk.Kendaraan;

// Inheritance: Motor mewarisi sifat Kendaraan
public class Motor extends Kendaraan {

    // Atribut khusus yang hanya dimiliki Motor
    private int jlhTorsi, faktorPembagi;
    private float panjangGagang, rasioGigi;

    // Constructor
    public Motor() {
    }

    // Setter khusus untuk atribut Motor
    public void setJlhTorsi(int value) {
        jlhTorsi = value;
    }

    public void setPanjangGagang(float value) {
        panjangGagang = value;
    }

    public void setRasioGigi(float value) {
        rasioGigi = value;
    }

    public void setFaktorPembagi(int value) {
        faktorPembagi = value;
    }

    // Override: percepatan dikali faktorPembagi
    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return super.kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi) * faktorPembagi;
    }

    // Override: tampilkan informasi motor
    @Override
    public void cetakInformasi(Object o) {
        System.out.println("==============");
        System.out.println(String.format("Motor saya berwarna %s.",
                ((Motor) o).getWarnaKendaraan()));
        System.out.println(String.format("Dimensi motor tersebut adalah %d meter persegi",
                ((Motor) o).getDimensiKendaraan()));
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.",
                kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi)));
        System.out.println(String.format("Motor tersebut memiliki %d kaca spion dan %d roda. ",
                ((Motor) o).getJlhSpion(), ((Motor) o).getJlhRoda()));
        System.out.println("==============");
    }
}