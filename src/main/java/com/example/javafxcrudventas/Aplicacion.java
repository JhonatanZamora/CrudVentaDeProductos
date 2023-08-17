package com.example.javafxcrudventas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Aplicacion extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Aplicación de Venta de Productos");
        mostrarVentanaPrincipal();
    }

    private void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader;
            loader = new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("EmpresaVentaProductosView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        launch(args);
    }
}