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

// Inheritance: Mobil mewarisi sifat Kendaraan
public class Mobil extends Kendaraan {

    // Atribut khusus Mobil
    private int jlhTorsi, faktorPembagi;
    private float panjangGagang, rasioGigi;

    // Constructor
    public Mobil() {
    }

    // Setter khusus atribut Mobil
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

    // Override: tampilkan informasi mobil
    @Override
    public void cetakInformasi(Object o) {
        System.out.println("==============");
        System.out.println(String.format("Mobil saya berwarna %s.",
                ((Mobil) o).getWarnaKendaraan()));
        System.out.println(String.format("Dimensi mobil tersebut adalah %d meter persegi",
                ((Mobil) o).getDimensiKendaraan()));
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.",
                kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi)));
        System.out.println(String.format("Mobil tersebut memiliki %d kaca spion dan %d roda. ",
                ((Mobil) o).getJlhSpion(), ((Mobil) o).getJlhRoda()));
        System.out.println("==============");
    }
}