package com.example.gestordepedidos.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.example.gestordepedidos.model.Product;
import com.example.gestordepedidos.model.ProductManager;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductController implements Initializable {

    public AnchorPane rootPane;
    @FXML
        private TableView<Product> productTable;

    @FXML
    private TableColumn<Product, String> nameColumn;

    @FXML
    private TableColumn<Product, Integer> stockColumn;

    @FXML
    private TableColumn<Product, Double> priceColumn;

    private ProductManager productManager;

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        stockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        // Llenar la tabla de productos
        productTable.getItems().addAll(productManager.getProductList());
    }

    // Métodos de acción del usuario para agregar o eliminar productos, etc.
}
