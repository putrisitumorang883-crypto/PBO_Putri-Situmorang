/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_2;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL



// Class parent: kurir reguler yang lewat jalur darat
class KurirReguler {

    // Atribut nama kurir, protected biar bisa diakses child class
    protected String nama;

    // Constructor buat set nama kurir
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method kirimBarang versi dasar (jalur darat)
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat
                + " lewat jalur darat menembus kecamatan.");
    }
}

// Class child: kurir drone yang terbang lewat udara
class KurirDrone extends KurirReguler {

    // Atribut tambahan khusus drone
    private String idDrone;

    // Constructor: panggil constructor parent dulu pakai super(nama)
    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    // @Override = tanda kalau method ini menimpa method parent
    // Method kirimBarang versi drone (jalur udara)
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama
                + " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

// Class utama buat nyoba overriding
public class SimulationOverriding {

    public static void main(String[] args) {

        System.out.println("=== INI METHOD OVERRIDING ===");

        // k1 bertipe KurirReguler, objek asli KurirReguler
        KurirReguler k1 = new KurirReguler("Budi");

        // k2 bertipe KurirReguler, tapi objek asli KurirDrone
        // Ini namanya upcasting, aman karena Drone adalah anak Reguler
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // Panggil method lewat referensi parent
        // k1 bakal jalan method parent (jalur darat)
        // k2 bakal jalan method child (terbang), karena objek aslinya Drone
        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}


/*
  Lembar Analisis Overriding:
 
  1. Pada class KurirDrone, hapus atau jadikan komentar baris @Override.
     Kemudian ubah nama method menjadi salah ketik:
     public void kirimbarang(String alamat)
 
     Jawaban:
     Setelah @Override dihapus dan nama method diubah menjadi
     kirimbarang() dengan huruf 'b' kecil, method tersebut tidak lagi
     dianggap sebagai overriding dari method kirimBarang() milik parent.
     Hal ini terjadi karena Java membedakan huruf besar dan huruf kecil
     (case-sensitive).
 
  2. Jalankan SimulasiOverriding.java. Apa output yang tercetak dari
     k2.kirimBarang("Gedung Graha Lt. 5")?
 
     Jawaban:
     Output berubah menjadi method milik class KurirReguler, yaitu:
 
     Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat
     menembus kemacetan.
 
     Hal ini terjadi karena method kirimbarang() yang salah ketik tidak
     menggantikan method kirimBarang() milik parent. Akibatnya, ketika
     k2.kirimBarang() dipanggil, yang digunakan adalah method milik
     KurirReguler.
 
  3. Kembalikan @Override di atas method yang salah ketik, kemudian
     kompilasi ulang. Salin pesan error yang muncul!
 
     Jawaban:
     Compiler akan memberikan pesan error yang menunjukkan bahwa method
     tersebut tidak melakukan override terhadap method dari parent.
     Contoh pesan error:
 
     method does not override or implement a method from a supertype
 
     Error tersebut muncul karena kirimbarang() tidak sama dengan
     kirimBarang(). Perbedaannya hanya huruf 'b', tetapi Java
     memperlakukan keduanya sebagai nama method yang berbeda.
 
  4. Berdasarkan eksperimen di atas, jelaskan fungsi utama @Override
     bagi seorang programmer!
 
     Jawaban:
     @Override berfungsi untuk memberi tahu programmer dan compiler
     bahwa method pada class child dimaksudkan untuk menggantikan
     atau mengubah method yang berasal dari class parent.
     @Override juga membantu menemukan kesalahan penulisan method,
     seperti kesalahan huruf besar dan kecil pada nama method.
*/


