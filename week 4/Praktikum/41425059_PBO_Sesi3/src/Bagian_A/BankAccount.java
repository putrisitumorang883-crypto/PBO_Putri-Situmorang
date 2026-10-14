/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

// Nim   : 41425059
// Nama  : Putri Yuni Br Situmorang
// Motto : Small steps every day lead to big results
// Prodi : D-IV TRPL

public class BankAccount {
 
    // Atribut private: hanya dapat diakses dari dalam kelas ini
    private String accountNumber;   // nomor rekening (read-only dari luar)
    private double balance;         // saldo rekening (tidak boleh negatif)

    // Constructor: inisialisasi akun dengan validasi saldo awal
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        // Validasi: saldo awal tidak boleh negatif
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // Getter accountNumber: hanya baca, tidak ada setter (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter balance: akses baca saldo dari luar kelas
    public double getBalance() {
        return balance;
    }

    // Mutator deposit: menyetor uang dengan validasi jumlah > 0
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            // Tolak setoran tidak valid
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Mutator withdraw: menarik uang dengan validasi berlapis
    public void withdraw(double amount) {
        if (amount <= 0) {
            // Tolak jumlah penarikan tidak valid
            System.out.println("Jumlah penarikan tidak valid!");
        } else if (amount > this.balance) {
            // Tolak jika saldo tidak mencukupi
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");
        } else {
            // Penarikan valid: kurangi saldo
            this.balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }

    // Method main: titik masuk program untuk pengujian
    public static void main(String[] args) {
        // Buat akun dengan saldo awal 500.000
        BankAccount acc = new BankAccount("ACC-001", 500000);

        acc.deposit(-100000);   // uji validasi: setoran negatif ditolak
        acc.withdraw(700000);   // uji validasi: penarikan melebihi saldo ditolak
        acc.withdraw(200000);   // penarikan valid

        // Tampilkan saldo akhir
        System.out.println("Saldo akhir akun " + acc.getAccountNumber()
                + ": Rp" + acc.getBalance());
    }
}   