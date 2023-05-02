package com.example.gestordepedidos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Cargar la vista FXML
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/gestordepedidos/view/Login.fxml")));

        // Crear una escena
        Scene scene = new Scene(root);

        // Establecer la escena en la ventana
        primaryStage.setScene(scene);

        // Mostrar la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
