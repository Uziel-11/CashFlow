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
    private TableView<valoresTabla> ingresos;

    @FXML
    private TableColumn<valoresTabla, String> idIngreso;

    @FXML
    private TableColumn<valoresTabla, Double> semana1I;

    @FXML
    private TableColumn<valoresTabla, Double> semana2I;

    @FXML
    private TableColumn<valoresTabla, Double> semana3I;

    @FXML
    private TableColumn<valoresTabla, Double> semana4I;

    @FXML
    private TableColumn<?, ?> finalIngreso;

    @FXML
    private TableView<valoresTabla> gastos;

    @FXML
    private TableColumn<valoresTabla, String> idGastos;

    @FXML
    private TableColumn<valoresTabla, Double> semana1G;

    @FXML
    private TableColumn<valoresTabla, Double> semana2G;

    @FXML
    private TableColumn<valoresTabla, Double> semana3G;

    @FXML
    private TableColumn<valoresTabla, Double> semana4G;

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
    ObservableList<valoresTabla> datos = FXCollections.observableArrayList();
    ObservableList<valoresTabla> datos2 = FXCollections.observableArrayList();

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

        idIngreso.setCellValueFactory(new PropertyValueFactory<valoresTabla, String>("subCategoria"));
        semana1I.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana1"));
        semana2I.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana2"));
        semana3I.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana3"));
        semana4I.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana4"));
        FujoDineroDAO dao = new FujoDineroDAO();

        ingresos.setItems(datos);


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
