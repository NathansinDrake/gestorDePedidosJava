module com.example.gestordepedidos {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.example.gestordepedidos to javafx.fxml;
    exports com.example.gestordepedidos;
}