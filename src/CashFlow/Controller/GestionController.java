package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.Gestion;
import CashFlow.Model.GestionDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class GestionController {

    @FXML
    private TextField NoSemanaCobrar;

    @FXML
    private TextField RazonCobro;

    @FXML
    private TextField MontoCobro;

    @FXML
    private TextField NoSemanaPagar;

    @FXML
    private TextField RazonPagar;

    @FXML
    private TextField MontoPagar;

    @FXML
    private TextField NoSemanaBanco;

    @FXML
    private TextField RazonBanco;

    @FXML
    private TextField MontoBanco;

    @FXML
    void GuardarBanco() {

        new Gestion ("banco", Integer.valueOf(NoSemanaBanco.getText()),
                RazonBanco.getText(), Integer.valueOf(MontoBanco.getText()));

        GestionDAO dao= new GestionDAO();
        boolean sms = dao.guardar();

        mensaje(sms);

        NoSemanaBanco.clear();
        RazonBanco.clear();
        MontoBanco.clear();
    }

    @FXML
    void GuardarCobro() {
        new Gestion( "cobro", Integer.valueOf(NoSemanaCobrar.getText()),
                RazonCobro.getText(), Integer.valueOf(MontoCobro.getText()));

        GestionDAO dao = new GestionDAO();
        boolean sms = dao.guardar();

        mensaje(sms);
        NoSemanaCobrar.clear();
        RazonCobro.clear();
        MontoCobro.clear();
    }

    @FXML
    void GuardarPago() {

        new Gestion("pago", Integer.valueOf(NoSemanaPagar.getText()),
                RazonPagar.getText(), Integer.valueOf(MontoPagar.getText()));

        GestionDAO dao = new GestionDAO();
        boolean sms = dao.guardar();

        mensaje(sms);
        NoSemanaPagar.clear();
        RazonPagar.clear();
        MontoPagar.clear();
    }

    public void mensaje(boolean mesaj){
        if (mesaj == true){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("MENSAJE");
            alert.setHeaderText(null);
            alert.setContentText("EL producto se agrego correctamente");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("ALERTA");
            alert.setHeaderText(null);
            alert.setContentText("EL producto no se a Agregado");
            alert.showAndWait();
        }
    }

    @FXML
    void regresarMenu() {
        Main.setFXML("Menu", "Menu");
    }

}

