package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.FlujoDinero;
import CashFlow.Model.FujoDineroDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class FlujoController implements Initializable {

    @FXML
    private TableView<FlujoDinero> tablaFlujo;

    @FXML
    private TableColumn<FlujoDinero, String> fechaColum;

    @FXML
    private TableColumn<FlujoDinero, String> descripcionColum;

    @FXML
    private TableColumn<FlujoDinero, String> categoriaColum;

    @FXML
    private TableColumn<FlujoDinero, String> subCateColum;

    @FXML
    private ComboBox<String> categorias;


    @FXML
    private TextField descripcion;

    @FXML
    private TextField cantidad;


    FlujoDinero flujo = new FlujoDinero();
    FujoDineroDAO dao = new FujoDineroDAO();
    ObservableList<FlujoDinero> datos = FXCollections.observableArrayList();

    @FXML
    void guardar() {
        flujo.setCategoria(categorias.getValue());
        flujo.setDescripcion(descripcion.getText());
        flujo.setCantidad(Integer.valueOf(cantidad.getText()));
        FujoDineroDAO flujo1 = new FujoDineroDAO();
        boolean msm = flujo1.insertar(flujo);
        if (msm == true){
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

        descripcion.clear();
        cantidad.clear();
        llenarTabla();
    }

    public void llenarTabla() {
        List<FlujoDinero> flujoList = dao.getFlujoDinero();

        fechaColum.setCellValueFactory(new PropertyValueFactory<FlujoDinero, String>("fecha"));
        descripcionColum.setCellValueFactory(new PropertyValueFactory<FlujoDinero, String>("descripcion"));
        categoriaColum.setCellValueFactory(new PropertyValueFactory<FlujoDinero, String>("categoria"));
        subCateColum.setCellValueFactory(new PropertyValueFactory<FlujoDinero, String>("subcat"));


        datos = dao.getFlujoDinero();
        tablaFlujo.setItems(datos);
    }


    @FXML
    void regresarMenu() {
        Main.setFXML("Menu", "Menu");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        llenarTabla();
        ObservableList<String> datos = FXCollections.observableArrayList();
        datos.addAll("GAO", "Ingreso", "Gasto_Venta");
        categorias.setItems(datos);
    }
}



