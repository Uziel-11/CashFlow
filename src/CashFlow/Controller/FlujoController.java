package CashFlow.Controller;

import CashFlow.Main;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;

public class FlujoController {

    @FXML
    private TableView<?> tablaDatosFlujoDinero;

    @FXML
    private TableColumn<?, ?> fechaColum;

    @FXML
    private TableColumn<?, ?> descripcionColum;

    @FXML
    private TableColumn<?, ?> categoriaColum;

    @FXML
    private TableColumn<?, ?> subCateColum;

    @FXML
    private ComboBox<?> categoriasOpciones;

    @FXML
    private TextField textFieldDescripcion;

    @FXML
    private TextField textFieldCantidad;

    @FXML
    private ComboBox<?> tipoFlujo;

    @FXML
    void GuardarOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void regresarMenu(MouseEvent event) {
        Main.setFXML("Menu", "Menu");
    }

}



