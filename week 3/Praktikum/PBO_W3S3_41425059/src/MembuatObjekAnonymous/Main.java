/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatObjekAnonymous;


//  Nama : Putri Yuni Br Situmorang  
//  Nim  :  41425059
// Prodi : D-IV TRPL 

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button button = new Button("Click Me"); // membuat tombol Click Me

        button.setOnAction( // menentukan aksi ketika tombol ditekan.
            event
            -> System.out.println( // untuk menangani aksi tombol
                "Button clicked!")); // Anonymous object melalui lambda

        StackPane root = new StackPane(button); // membuat layout untuk tombol.

        stage.setScene(new Scene(root, 300, 200)); // mengatur tampilan window.

        stage.show(); // menampilkan window.
    }
}

