package CashFlow.Controller;


import CashFlow.Main;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    void verCategorias() {
        Main.setFXML("Categorias","Categorias");
    }

    @FXML
    void gestionDinero(){
        Main.setFXML("GestionDinero", "Gestion de Dinero");
    }

    @FXML
    void flujoDinero(){
        Main.setFXML("FlujoDinero","Flujo de Dinero");
    }

    @FXML
    void reporte(){
        Main.setFXML("Reporte", "Reporte");
    }

}
