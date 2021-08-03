package CashFlow.Controller;


import CashFlow.Main;
import CashFlow.Model.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    ImageView logo;

    @FXML
    void verCategorias() {
        Main.setFXML("Categorias","Categorias");
    }

    @FXML
    void gestionDinero(){
        Main.setFXML("Gestion", "Gestion de Dinero");
    }

    @FXML
    void flujoDinero(){
        Main.setFXML("FlujoDinero","Flujo de Dinero");
    }

    @FXML
    void reporte(){
       Main.setFXML("Reporte", "Reporte");


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("../Recursos/logo.jpeg"));
        logo.setImage(image);


    }

    public void salir(){
        System.exit(1);
    }
}
