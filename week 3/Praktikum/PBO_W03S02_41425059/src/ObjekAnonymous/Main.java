/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjekAnonymous;

/**
 *
 * @author USER
 */
public class Main {
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// extends Application: wajib untuk membuat aplikasi JavaFX
public class Main extends Application {
    // main() memanggil launch(args) untuk menjalankan siklus hidup aplikasi JavaFX
    public static void main(String[] args) { launch(args); }

    // start() dipanggil otomatis oleh JavaFX setelah aplikasi siap dijalankan
    @Override public void start(Stage stage)
    {
        // Membuat objek Button dengan teks "Click Me"
        Button button = new Button("Click Me");

        // setOnAction: menentukan aksi saat tombol diklik
        // Lambda expression "event -> ..." di sini adalah contoh
        // objek anonim: objek event handler dibuat tanpa disimpan
        // ke variabel, langsung dipakai sekali lalu dibuang
        button.setOnAction(
            event
            -> System.out.println(
                "Button clicked!")); // Anonymous object melalui lambda

        // Menyusun tombol ke dalam layout StackPane
        StackPane root = new StackPane(button);

        // Mengatur Scene (ukuran 300x200) dan menampilkan window (Stage)
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }
}
