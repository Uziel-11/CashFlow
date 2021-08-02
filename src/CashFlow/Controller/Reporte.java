package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class Reporte implements Initializable {

    @FXML
    private ComboBox<String> mes;

    @FXML
    private TableView<?> porCobrar;

    @FXML
    private TableColumn<?, ?> idPorCobrar;

    @FXML
    private TableColumn<?, ?> semana1PC;

    @FXML
    private TableColumn<?, ?> semana2PC;

    @FXML
    private TableColumn<?, ?> semana3PC;

    @FXML
    private TableColumn<?, ?> semana4PC;

    @FXML
    private TableColumn<?, ?> finalPC;

    @FXML
    private TableView<?> porPagar;

    @FXML
    private TableColumn<?, ?> idPorPagar;

    @FXML
    private TableColumn<?, ?> semana1P;

    @FXML
    private TableColumn<?, ?> semana2P;

    @FXML
    private TableColumn<?, ?> semana3P;

    @FXML
    private TableColumn<?, ?> semana4P;

    @FXML
    private TableColumn<?, ?> finalPagar;

    @FXML
    private TableView<ingresosGastos> ingresos;

    @FXML
    private TableColumn<ingresosGastos, String> idIngreso;

    @FXML
    private TableColumn<ingresosGastos, Double> semana1I;

    @FXML
    private TableColumn<ingresosGastos, Double> semana2I;

    @FXML
    private TableColumn<ingresosGastos, Double> semana3I;

    @FXML
    private TableColumn<ingresosGastos, Double> semana4I;

    @FXML
    private TableColumn<?, ?> finalIngreso;

    @FXML
    private TableView<ingresosGastos> gastos;

    @FXML
    private TableColumn<ingresosGastos, String> idGastos;

    @FXML
    private TableColumn<ingresosGastos, Double> semana1G;

    @FXML
    private TableColumn<ingresosGastos, Double> semana2G;

    @FXML
    private TableColumn<ingresosGastos, Double> semana3G;

    @FXML
    private TableColumn<ingresosGastos, Double> semana4G;

    @FXML
    private TableColumn<?, ?> finalGastos;

    @FXML
    private TableView<?> bancos;

    @FXML
    private TableColumn<?, ?> idBancos;

    @FXML
    private TableColumn<?, ?> semana1B;

    @FXML
    private TableColumn<?, ?> semana2B;

    @FXML
    private TableColumn<?, ?> semana3B;

    @FXML
    private TableColumn<?, ?> semana4B;

    @FXML
    private TableColumn<?, ?> finalBanco;

    @FXML
    private TableView<?> TableViewDiferencia;

    @FXML
    private TableColumn<?, ?> idDiferencia;

    @FXML
    private TableColumn<?, ?> semana1D;

    @FXML
    private TableColumn<?, ?> semana2D;

    @FXML
    private TableColumn<?, ?> semana3D;

    @FXML
    private TableColumn<?, ?> semana4D;

    @FXML
    private TableColumn<?, ?> finalDirerencia;
    ObservableList<valores> datos = FXCollections.observableArrayList();
    ObservableList<valores> datos2 = FXCollections.observableArrayList();

    ObservableList<String> combox = FXCollections.observableArrayList(
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    );

    @FXML
    void regresarMenu() {
        Main.setFXML("Menu", "Menu");
    }

    @FXML
    void mostrarReporte(MouseEvent event) {

        ReporteJasper informe = new ReporteJasper();
        informe.reporteMes();
    }


    public void llenarEntradas() {
        String valor1 = mes.getValue();

        /*idIngreso.setCellValueFactory(new PropertyValueFactory<ingresosGastos, String>("categoria"));
        semana1I.setCellValueFactory(new PropertyValueFactory<ingresosGastos, Double>("valor"));
        semana2I.setCellValueFactory(new PropertyValueFactory<ingresosGastos, Double>("semana2"));
        semana3I.setCellValueFactory(new PropertyValueFactory<ingresosGastos, Double>("semana3"));
        semana4I.setCellValueFactory(new PropertyValueFactory<ingresosGastos, Double>("semana4"));
        FujoDineroDAO dao = new FujoDineroDAO();


        datos = dao.getIngresosG("entrada", valor1, 1);

        datos = dao.getIngresosG("entrada", valor1, 2);
        ingresos.setItems(datos);*/


    }

    public void llenarSalidas() {
        String valor1 = mes.getValue();

       /* idGastos.setCellValueFactory(new PropertyValueFactory<ingresosGastos, String>("categoria"));
        semana1G.setCellValueFactory(new PropertyValueFactory<ingresosGastos, Double>("semana1"));
        semana2G.setCellValueFactory(new PropertyValueFactory<ingresosGastos, Double>("semana2"));
        semana3G.setCellValueFactory(new PropertyValueFactory<ingresosGastos, Double>("semana3"));
        semana4G.setCellValueFactory(new PropertyValueFactory<ingresosGastos, Double>("semana4"));
        FujoDineroDAO dao = new FujoDineroDAO();
        datos2 = dao.getIngresosG("salida", valor1);
        gastos.setItems(datos2);*/
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       mes.setItems(combox);
    }

    }
