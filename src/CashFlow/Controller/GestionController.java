package CashFlow.Controller;

import CashFlow.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;

public class GestionController {

    @FXML
    private TextField idNoSemanaCobrar;

    @FXML
    private TextField idRazonCobro;

    @FXML
    private TextField idMontoCobro;

    @FXML
    private TextField idNoSemanaPagar;

    @FXML
    private TextField idRazonPagar;

    @FXML
    private TextField idMontoPagar;

    @FXML
    private TextField idNoSemanaBanco;

    @FXML
    private TextField idRazonBanco;

    @FXML
    private TextField idMontoBanco;

    @FXML
    void GuardarBanco() {

    }

    @FXML
    void GuardarCobro() {

    }

    @FXML
    void GuardarPago() {

    }

    @FXML
    void regresarMenu() {
        Main.setFXML("Menu", "Menu");
    }

}

