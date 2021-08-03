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
    private TableColumn<valoresTabla, Double> semana5I;

    @FXML
    private TableColumn<valoresTabla, Double> finalIngreso;

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
    private TableColumn<valoresTabla, Double> semana5G;

    @FXML
    private TableColumn<valoresTabla, Double> finalGastos;

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
    private TableView<valoresTabla> TableViewDiferencia;

    @FXML
    private TableColumn<valoresTabla, String> idDiferencia;

    @FXML
    private TableColumn<valoresTabla, Double> semana1D;

    @FXML
    private TableColumn<valoresTabla, Double> semana2D;

    @FXML
    private TableColumn<valoresTabla, Double> semana3D;

    @FXML
    private TableColumn<valoresTabla, Double> semana4D;

    @FXML
    private TableColumn<valoresTabla, Double> idSemana5Diferencia;

    @FXML
    private TableColumn<valoresTabla, Double> finalDirerencia;


    @FXML
    private TableView<valoresTabla> TableViewMargen;

    @FXML
    private TableColumn<valoresTabla, String> idMargen;

    @FXML
    private TableColumn<valoresTabla, Double> semana1M;

    @FXML
    private TableColumn<valoresTabla, Double> semana2M;

    @FXML
    private TableColumn<valoresTabla, Double> semana3M;

    @FXML
    private TableColumn<valoresTabla, Double> semana4M;

    @FXML
    private TableColumn<valoresTabla, Double> Semana5M;

    @FXML
    private TableColumn<valoresTabla, Double> finalMargen;

    ObservableList<valoresTabla> datos = FXCollections.observableArrayList();
    ObservableList<valoresTabla> datos2 = FXCollections.observableArrayList();
    ObservableList<valoresTabla> datos3 = FXCollections.observableArrayList();
    ObservableList<valoresTabla> datos4 = FXCollections.observableArrayList();
    valoresTabla v1 = new valoresTabla();  valoresTabla v2 = new valoresTabla();



    diferencia dif= new diferencia ();

    ObservableList<String> combox = FXCollections.observableArrayList(
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    );

    @FXML
    void regresarMenu() {
        Main.setFXML("Menu", "Menu");
    }

    @FXML
    void mostrarReporte(MouseEvent event) {
llenarEntradas();
llenarSalidas();
calcularDiferencia();
    }


    public void llenarEntradas() {
        String valor1 = mes.getValue();

        idIngreso.setCellValueFactory(new PropertyValueFactory<valoresTabla, String>("subCategoria"));
        semana1I.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana1"));
        semana2I.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana2"));
        semana3I.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana3"));
        semana4I.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana4"));
        semana5I.setCellValueFactory(new PropertyValueFactory<valoresTabla,Double>("semana5"));
        finalIngreso.setCellValueFactory(new PropertyValueFactory<valoresTabla,Double>("total"));
        FujoDineroDAO dao = new FujoDineroDAO();
         datos = dao.getIngresosG(valor1);
        ingresos.setItems(datos);
        for(int i = 0; i < datos.size(); i++){
            if(datos.get(i).getSubCategoria().equals("sumTotal")){
                v1 = datos.get(i);
            }
        }

    }

    public void llenarSalidas() {
        String valor1 = mes.getValue();

        idGastos.setCellValueFactory(new PropertyValueFactory<valoresTabla, String>("subCategoria"));
        semana1G.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana1"));
        semana2G.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana2"));
        semana3G.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana3"));
        semana4G.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana4"));
        semana5G.setCellValueFactory(new PropertyValueFactory<valoresTabla,Double>("semana5"));
        finalGastos.setCellValueFactory(new PropertyValueFactory<valoresTabla,Double>("total"));
        FujoDineroDAO dao = new FujoDineroDAO();
        datos2 = dao.getSalida(valor1);
        gastos.setItems(datos2);
        for(int i = 0; i < datos2.size(); i++){
            if(datos2.get(i).getSubCategoria().equals("sumTotal")){
                v2 = datos2.get(i);
            }
        }
    }

    public void calcularDiferencia(){
        valoresTabla diferencia = new valoresTabla();
        valoresTabla margen = new valoresTabla();
        diferencia.setSubCategoria("TOTAL UTILIDAD");
        diferencia.setSemana1(v1.getSemana1()-v2.getSemana1());
        diferencia.setSemana2(v1.getSemana2()-v2.getSemana2());
        diferencia.setSemana3(v1.getSemana3()-v2.getSemana3());
        diferencia.setSemana4(v1.getSemana4()-v2.getSemana4());
        diferencia.setSemana5(v1.getSemana1()-v2.getSemana5());
        diferencia.setTotal(v1.getTotal()-v2.getTotal());
        datos3.add(diferencia);

        margen.setSubCategoria("MARGEN Rentabilidad");
        margen.setSemana1((diferencia.getSemana1()/ v1.getSemana1())*100);
        margen.setSemana2((diferencia.getSemana2()/ v1.getSemana2())*100);
        margen.setSemana3((diferencia.getSemana3()/ v1.getSemana3())*100);
        margen.setSemana4((diferencia.getSemana4()/ v1.getSemana4())*100);
        margen.setSemana5((diferencia.getSemana5()/ v1.getSemana5())*100);
        margen.setTotal((diferencia.getTotal()/ v1.getTotal())*100);
        datos4.add(margen);


        idDiferencia.setCellValueFactory(new PropertyValueFactory<valoresTabla, String>("subCategoria"));
        semana1D.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana1"));
        semana2D.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana2"));
        semana3D.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana3"));
        semana4D.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana4"));
        idSemana5Diferencia.setCellValueFactory(new PropertyValueFactory<valoresTabla,Double>("semana5"));
        finalDirerencia.setCellValueFactory(new PropertyValueFactory<valoresTabla,Double>("total"));
        TableViewDiferencia.setItems(datos3);

        idMargen.setCellValueFactory(new PropertyValueFactory<valoresTabla, String>("subCategoria"));
        semana1M.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana1"));
        semana2M.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana2"));
        semana3M.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana3"));
        semana4M.setCellValueFactory(new PropertyValueFactory<valoresTabla, Double>("semana4"));
        Semana5M.setCellValueFactory(new PropertyValueFactory<valoresTabla,Double>("semana5"));
        finalMargen.setCellValueFactory(new PropertyValueFactory<valoresTabla,Double>("total"));
        TableViewMargen.setItems(datos4);

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       mes.setItems(combox);
    }

    }
