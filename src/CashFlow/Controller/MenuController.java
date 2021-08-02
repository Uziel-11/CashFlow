package CashFlow.Controller;


import CashFlow.Main;
import CashFlow.Model.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    ImageView logo;

    @FXML
    void verCategorias() {
        Main.setFXML("Categorias","Categorias");
    }

    @FXML
    void gestionDinero(){
        Main.setFXML("Gestion", "Gestion de Dinero");
    }

    @FXML
    void flujoDinero(){
        Main.setFXML("FlujoDinero","Flujo de Dinero");
    }

    @FXML
    void reporte(){
       // Main.setFXML("Reporte", "Reporte");

        ReporteJasper informe = new ReporteJasper();
        informe.reporteMes();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("../Recursos/logo.jpeg"));
        logo.setImage(image);

        double a;
        double b;
        double dif;
        double resta;
        double total;

        diferenciaDAO diferenciaDAO = new diferenciaDAO();
        FujoDineroDAO flujodao = new FujoDineroDAO ();
        margenDAO margen = new margenDAO();
        diferenciaDAO.truncate();
        margen.truncateDos();

        //operaciones
        for (int x=1; x<5; x++){
            a=flujodao.sacarTotal1(x);
            b=flujodao.sacarTotal2(x);
            dif=(a-b);
            System.out.println("diferencia: "+dif);
            diferencia diferencia = new diferencia(x,dif);
            boolean resultado = diferenciaDAO.insert(diferencia);
            if (dif != 0){
                resta = (a-b);
                System.out.println("resta: "+resta);
                total = (resta/a);
                System.out.println("total1: "+total);
                total = (total *100);
                System.out.println("total2: "+total);

            } else {
                total = 0;
            }
            margen margen1 = new margen(x,total);
            boolean resultado2 = margen.insert(margen1);

        }
    }

    public void salir(){
        System.exit(1);
    }
}
