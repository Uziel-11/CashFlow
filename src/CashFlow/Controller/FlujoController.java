package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.FlujoDinero;
import CashFlow.Model.FujoDineroDAO;
import CashFlow.Model.categoriasDAO;
import CashFlow.Model.flujoCash;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.*;


public class FlujoController implements Initializable {

    @FXML
    private TableView<flujoCash> tablaFlujo;

    @FXML
    private TableColumn<flujoCash, Date> fechaColum;

    @FXML
    private TableColumn<flujoCash, String> descripcionColum;

    @FXML
    private TableColumn<flujoCash, String> categoriaColum;

    @FXML
    private TableColumn<flujoCash, String> subCateColum;

    @FXML
    private ComboBox<String> categorias;


    @FXML
    private TextField descripcion;

    @FXML
    private TextField cantidad;

    @FXML
    private CheckBox entradaBox;

    @FXML
    private CheckBox salidaBox;



    FlujoDinero flujo = new FlujoDinero();
    FujoDineroDAO dao = new FujoDineroDAO();
    ObservableList<flujoCash> datos = FXCollections.observableArrayList();
    ObservableList<String> combox = FXCollections.observableArrayList();
    @FXML
    void guardar() {
        String tipo = "";
        int numsem = obtenerSemana();
        String mes= obtenerMes();
        FujoDineroDAO dao = new FujoDineroDAO();
        String[] selectCategoria = categorias.getValue().split("-");
        double cant = Double.parseDouble(cantidad.getText());
        Date objDate = new Date();
        java.util.Date dateUtil=new java.util.Date(String.valueOf(objDate));
        System.out.println(dateUtil);
        java.sql.Date dateSql= new java.sql.Date(dateUtil.getTime());
        System.out.println(dateSql);
        if (entradaBox.isSelected()==true) {
            tipo = "entrada";
        } else {
            tipo = "salida";
        }
        flujoCash flujo = new flujoCash();
        flujo.setCantidad(cant);flujo.setDescripcion(descripcion.getText()); flujo.setTipoFlujo(tipo); flujo.setFecha(dateSql); flujo.setNumSemana(numsem); flujo.setMes(mes); flujo.setCategoria(selectCategoria[0]);flujo.setSubcategoria(selectCategoria[1]);

         if(dao.insertar(flujo)){
             entradaBox.setSelected(false);
             salidaBox.setSelected(false);
             descripcion.clear();
             cantidad.clear();
         }
         tablaFlujo.refresh();
         llenarTabla();

    }

    public void llenarTabla() {
        List<flujoCash> flujoList = dao.getFlujoDinero();

        fechaColum.setCellValueFactory(new PropertyValueFactory<flujoCash, Date>("fecha"));
        descripcionColum.setCellValueFactory(new PropertyValueFactory<flujoCash, String>("descripcion"));
        categoriaColum.setCellValueFactory(new PropertyValueFactory<flujoCash, String>("categoria"));
        subCateColum.setCellValueFactory(new PropertyValueFactory<flujoCash, String>("subcategoria"));
        datos = dao.getFlujoDinero();
        tablaFlujo.setItems(datos);
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
        int numsem = c.get(Calendar.WEEK_OF_MONTH);
        System.out.println("semana: "+numsem);
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

    public int obtenerSemana() {

        Calendar c = new GregorianCalendar();
        String dia = Integer.toString(c.get(Calendar.DATE));
        int numsem = c.get(Calendar.WEEK_OF_MONTH);
        System.out.println("semana: "+numsem);
        return numsem;
    }

    public void llenarCombobox(){
        categoriasDAO cat = new categoriasDAO();
        combox = cat.getCategoriasBox();
        categorias.setItems(combox);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        llenarTabla();
        ObservableList<String> datos = FXCollections.observableArrayList();
        llenarCombobox();
    }
}



