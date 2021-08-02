package CashFlow.Controller;

import CashFlow.Main;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Reporte {

    @FXML
    private ComboBox<?> mes;

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
    private TableView<?> ingresos;

    @FXML
    private TableColumn<?, ?> idIngreso;

    @FXML
    private TableColumn<?, ?> semana1I;

    @FXML
    private TableColumn<?, ?> semana2I;

    @FXML
    private TableColumn<?, ?> semana3I;

    @FXML
    private TableColumn<?, ?> semana4I;

    @FXML
    private TableColumn<?, ?> finalIngreso;

    @FXML
    private TableView<?> gastos;

    @FXML
    private TableColumn<?, ?> idGastos;

    @FXML
    private TableColumn<?, ?> semana1G;

    @FXML
    private TableColumn<?, ?> semana2G;

    @FXML
    private TableColumn<?, ?> semana3G;

    @FXML
    private TableColumn<?, ?> semana4G;

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

    @FXML
    void regresarMenu() {
        Main.setFXML("Menu", "Menu");
    }

}

