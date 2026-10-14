/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

// Kelas untuk mencatat nilai kuis & UTS dengan validasi + read-only property
public class StudentGrade {

    // Atribut read-only: pakai final agar tidak bisa diubah setelah constructor
    private final String nim;
    private final String nama;

    // Atribut nilai: bisa diubah lewat setter dengan validasi
    private double nilaiKuis;
    private double nilaiUts;

    // Atribut read-only turunan: dikalkulasi otomatis, tidak ada setter
    private String gradeHuruf;

    // Constructor: registrasi mahasiswa (nim & nama hanya di-set di sini)
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: "
                + nim + " - " + nama);
    }

    // Getter read-only
    public String getNim()        { return nim; }
    public String getNama()       { return nama; }
    public double getNilaiKuis()  { return nilaiKuis; }
    public double getNilaiUts()   { return nilaiUts; }
    public String getGradeHuruf() { return gradeHuruf; }

    // Setter nilaiKuis: validasi rentang 0-100
    public void setNilaiKuis(double nilaiKuis) {
        // Tolak jika di luar rentang 0-100
        if (nilaiKuis < 0.0 || nilaiKuis > 100.0) {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis
                    + " (Harus antara 0 - 100)");
            return;   // batalkan perubahan
        }
        // Simpan nilai valid
        this.nilaiKuis = nilaiKuis;
        System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
        hitungGradeHuruf();   // update grade otomatis
    }

    // Setter nilaiUts: validasi rentang 0-100
    public void setNilaiUts(double nilaiUts) {
        if (nilaiUts < 0.0 || nilaiUts > 100.0) {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUts
                    + " (Harus antara 0 - 100)");
            return;
        }
        this.nilaiUts = nilaiUts;
        System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUts);
        hitungGradeHuruf();
    }

    // Method private: hitung nilai akhir (40% kuis + 60% UTS)
    private double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUts);
    }

    // Method private: kalkulasi grade huruf dari nilai akhir
    private void hitungGradeHuruf() {
        double na = hitungNilaiAkhir();
        if (na >= 85)      gradeHuruf = "A";
        else if (na >= 70) gradeHuruf = "B";
        else if (na >= 60) gradeHuruf = "C";
        else if (na >= 50) gradeHuruf = "D";
        else               gradeHuruf = "E";
    }

    // Method untuk mencetak laporan hasil studi
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUts);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("Grade      : " + gradeHuruf);
    }

    // Method main: pengujian
    public static void main(String[] args) {
        StudentGrade mhs = new StudentGrade("11425001", "Marsha");

        mhs.setNilaiKuis(110);  // ditolak (di luar rentang)
        mhs.setNilaiKuis(85);   // berhasil
        mhs.setNilaiUts(90);    // berhasil

        mhs.cetakLaporan();  // cetak KHS
    }
}
