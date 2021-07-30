package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.categorias;
import CashFlow.Model.categoriasDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class CategoriasController implements Initializable {
    ObservableList<categorias> list ;
    ObservableList<String> listaClasificacion = FXCollections.observableArrayList(
            "GAO","Ingreso", "Costo-Venta"
    );

    categorias cat ;
    categoriasDAO catDAO;

    @FXML
    private TableView<categorias> tablaCategorias;

    @FXML
    private TableColumn<categorias, String> clasificacionCat;

    @FXML
    private TableColumn<categorias, String> nombreCat;

    @FXML
    private TableColumn<categorias, String> nombreSubCat;

    @FXML
    private ComboBox<String> comboxClasificacion;

    @FXML
    private TextField idCategoria;

    @FXML
    private TextField idSubCategoria;

    @FXML
    void guardarOnMouseClicked(MouseEvent event) {
        cat = new categorias();
        catDAO = new categoriasDAO();
        System.out.println(idCategoria.getText());
        String valor = idCategoria.getText(); String valor2 = idSubCategoria.getText(); String valor3 = comboxClasificacion.getValue();
        if(valor.equals(null) ||  valor2.equals(null) || valor3.equals(null)) {
            Alert error = new Alert(Alert.AlertType.INFORMATION);
            error.setTitle("error");
            error.setContentText("No se puede completar el proceso, llene todos los campos");
            error.show();

        }else{
            cat.setNombre(idCategoria.getText());
            cat.setNombreSubCategoria(idSubCategoria.getText());
            cat.setClasificacion(comboxClasificacion.getValue());
            catDAO.insert(cat);
        }
        tablaCategorias.refresh();
        llenarTabla();

    }


    public void llenarTabla(){
        clasificacionCat.setCellValueFactory(new PropertyValueFactory<categorias, String>("clasificacion"));
        nombreCat.setCellValueFactory(new PropertyValueFactory<categorias, String>("nombre"));
        nombreSubCat.setCellValueFactory(new PropertyValueFactory<categorias, String>("nombreSubCategoria"));
        categoriasDAO dao = new categoriasDAO();
        list = dao.getCategorias();
        tablaCategorias.setItems(list);

    }

    @FXML
    void regresarMenu(MouseEvent event){
        Main.setFXML("Menu","Menu");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
 comboxClasificacion.setItems(listaClasificacion);
        llenarTabla();
    }

}
