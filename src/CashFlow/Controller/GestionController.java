package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.FlujoDinero;
import CashFlow.Model.Gestion;
import CashFlow.Model.GestionDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;


public class GestionController implements Initializable {

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
    private ComboBox<String> comboMeses;


    ObservableList<String> combox = FXCollections.observableArrayList(
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    );

    @FXML
    void GuardarBanco() {
     GestionDAO dao = new GestionDAO();
        Gestion gestion = new Gestion();
        String mes = comboMeses.getValue();
        String tipo = "banco";
        Double monto = Double.valueOf(MontoBanco.getText());
        gestion.setMes(mes); gestion.setTipo(tipo);gestion.setSemana1(monto);gestion.setRazonSocial(RazonBanco.getText());
        switch (Integer.parseInt(NoSemanaBanco.getText())){
            case 1: dao.guardar1(gestion); break;
            case 2: dao.guardarSm2(gestion); break;
            case 3: dao.guardarSm3(gestion);break;
            case 4: dao.guardarSm4(gestion);break;
            case 5: dao.guardarSm5(gestion);break;
        }

    }

    @FXML
    void GuardarCobro() {
        GestionDAO dao = new GestionDAO();
        Gestion gestion = new Gestion();
        String mes = comboMeses.getValue();
        String tipo = "cuentas por cobrar";
        Double monto = Double.valueOf(MontoCobro.getText());
        gestion.setMes(mes); gestion.setTipo(tipo);gestion.setSemana1(monto);gestion.setRazonSocial(RazonCobro.getText());
        switch (Integer.parseInt(NoSemanaCobrar.getText())){
            case 1: dao.guardar1(gestion); break;
            case 2: dao.guardarSm2(gestion); break;
            case 3: dao.guardarSm3(gestion);break;
            case 4: dao.guardarSm4(gestion);break;
            case 5: dao.guardarSm5(gestion);break;
        }

    }

    @FXML
    void GuardarPago() {
        GestionDAO dao = new GestionDAO();
        Gestion gestion = new Gestion();
        String mes = comboMeses.getValue();
        String tipo = "cuentas por pagar";
        Double monto = Double.valueOf(MontoPagar.getText());
        gestion.setMes(mes); gestion.setTipo(tipo);gestion.setSemana1(monto);gestion.setRazonSocial(RazonPagar.getText());
        switch (Integer.parseInt(NoSemanaPagar.getText())){
            case 1: dao.guardar1(gestion); break;
            case 2: dao.guardarSm2(gestion); break;
            case 3: dao.guardarSm3(gestion);break;
            case 4: dao.guardarSm4(gestion);break;
            case 5: dao.guardarSm5(gestion);break;
        }
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboMeses.setItems(combox);
    }
}

