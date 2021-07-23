package CashFlow.Controller;


import CashFlow.Main;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    void verCategorias(MouseEvent event) {
        Main.setFXML("Categorias","categorias");
    }

}
