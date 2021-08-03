package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ReporteController  implements Initializable {

    @FXML
    void regresarMenu() {
        Main.setFXML("Menu", "Menu");
    }

    @FXML
    void Mostrar(MouseEvent event) {

        ReporteJasper informe = new ReporteJasper();
        informe.reporteMes();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}