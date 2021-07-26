package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.categorias;
import CashFlow.Model.categoriasDAO;
import CashFlow.Model.subCategoria;
import CashFlow.Model.subCategoriaDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CategoriasController implements Initializable {
    ObservableList<categorias> list ;
    ObservableList<String> listaClasificacion = FXCollections.observableArrayList(
            "GAO","Ingreso", "Costo-Venta"
    );
    categorias cat;
    subCategoria subCat;
    categoriasDAO daoCat;
    subCategoriaDao daoSubCat;

    @FXML
    private TableView<categorias> tablaCategorias;

    @FXML
    private TableColumn<categorias, String> clasificacionCat;

    @FXML
    private TableColumn<categorias, String> nombreCat;

    @FXML
    private TableColumn<subCategoria, String> nombreSubCat;

    @FXML
    private ComboBox<String> comboxClasificacion;

    @FXML
    private TextField idCategoria;

    @FXML
    private TextField idSubCategoria;

    @FXML
    void guardarOnMouseClicked(MouseEvent event) {
        String nomCat= idCategoria.getText();
        String nombSubCat= idSubCategoria.getText();


        if(nomCat != null && nombSubCat !=null){
            daoSubCat = new subCategoriaDao();
            daoCat = new categoriasDAO();
            cat = new categorias();
            subCat = new subCategoria();

            subCat.setNombre(nombSubCat);
            daoSubCat.insert(subCat);
            if(comboxClasificacion != null){
                subCat = new subCategoria();
                subCat = daoSubCat.getSubCat(nombSubCat);
                cat.setClasificacion(comboxClasificacion.getValue());
                cat.setNombre(nomCat);
                cat.setIdSubCategoria(subCat);
                daoCat.insert(cat);

            }

        }
        idCategoria.clear();
        idSubCategoria.clear();
        llenarTabla();

    }


    public void llenarTabla(){
        clasificacionCat.setCellValueFactory(new PropertyValueFactory<categorias, String>("clasificacion"));
        nombreCat.setCellValueFactory(new PropertyValueFactory<categorias, String>("nombre"));
        nombreSubCat.setCellValueFactory(new PropertyValueFactory<subCategoria, String>("idSubCategoria"));
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
