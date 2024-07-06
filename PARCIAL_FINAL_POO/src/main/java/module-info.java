module com.org.example.parcial_final_poo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.org.example.parcial_final_poo to javafx.fxml;
    exports com.org.example.parcial_final_poo;
}