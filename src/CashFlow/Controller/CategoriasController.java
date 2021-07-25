package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.categorias;
import CashFlow.Model.categoriasDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CategoriasController implements Initializable {
    ObservableList<categorias> list ;


    @FXML
    private TableView<categorias> tablaCategorias;

    @FXML
    private TableColumn<categorias, String> clasificacionCat;

    @FXML
    private TableColumn<categorias, String> nombreCat;

    @FXML
    private TableColumn<?, ?> nombreSubCat;

    @FXML
    private ComboBox<?> comboxClasificacion;

    @FXML
    private TextField idCategoria;

    @FXML
    private TextField idSubCategoria;

    @FXML
    void GuardarOnMouseClicked(MouseEvent event) {

    }


    public void llenarTabla(){
        clasificacionCat.setCellValueFactory(new PropertyValueFactory<categorias, String>("clasificacion"));
        nombreCat.setCellValueFactory(new PropertyValueFactory<categorias, String>("nombre"));
        categoriasDAO dao = new categoriasDAO();
        list = dao.getCategorias();
        tablaCategorias.setItems(list);


    }

    @FXML
    void regresarMenu(){
        Main.setFXML("Menu","Menu");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
       llenarTabla();
            }

}
