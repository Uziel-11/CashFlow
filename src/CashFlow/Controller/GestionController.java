package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.FlujoDinero;
import CashFlow.Model.Gestion;
import CashFlow.Model.GestionDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.util.Calendar;
import java.util.GregorianCalendar;


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
     GestionDAO dao = new GestionDAO();
        Gestion gestion = new Gestion();
        String mes = obtenerMes();
        String tipo = "bancos";
        Double monto = Double.valueOf(MontoBanco.getText());
        gestion.setMes(mes); gestion.setTipo(tipo);gestion.setMonto(monto);gestion.setRazonSocial(RazonBanco.getText()); gestion.setNumSemana(Integer.parseInt(NoSemanaBanco.getText()));
        dao.guardar(gestion);
    }

    @FXML
    void GuardarCobro() {
        GestionDAO dao = new GestionDAO();
        Gestion gestion = new Gestion();
        String mes = obtenerMes();
        String tipo = "cuentas por cobrar";
        Double monto = Double.valueOf(MontoCobro.getText());
        gestion.setMes(mes); gestion.setTipo(tipo);gestion.setMonto(monto);gestion.setRazonSocial(RazonCobro.getText()); gestion.setNumSemana(Integer.parseInt(NoSemanaCobrar.getText()));
        dao.guardar(gestion);

    }

    @FXML
    void GuardarPago() {
        GestionDAO dao = new GestionDAO();
        Gestion gestion = new Gestion();
        String mes = obtenerMes();
        String tipo = "cuentas por pagar";
        Double monto = Double.valueOf(MontoPagar.getText());
        gestion.setMes(mes); gestion.setTipo(tipo);gestion.setMonto(monto);gestion.setRazonSocial(RazonPagar.getText()); gestion.setNumSemana(Integer.parseInt(NoSemanaPagar.getText()));
        dao.guardar(gestion);
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

    public String obtenerMes() {
        String mes = "";
        Calendar c = new GregorianCalendar();
        String dia = Integer.toString(c.get(Calendar.DATE));
        int Mes = c.get(Calendar.MONTH);
        String annio = Integer.toString(c.get(Calendar.YEAR));
        /*System.out.println("dia: "+dia+" " +
                "mes: "+Mes+" " +
                "año: "+annio);*/
        switch (Mes) {
            case 0: mes = "enero";
                break;
            case 1: mes = "febrero";
                break;
            case 2: mes = "marzo";
                break;
            case 3: mes = "abril";
                break;
            case 4: mes = "mayo";
                break;
            case 5: mes = "junio";
                break;
            case 6: mes = "julio";
                break;
            case 7: mes = "agosto";
                break;
            case 8: mes = "septiembre";
                break;
            case 9: mes = "octubre";
                break;
            case 10: mes = "noviembre";
                break;
            case 11: mes = "diciembre";
                break;
        }
        return mes;
    }

}

