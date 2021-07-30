package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ReporteController  implements Initializable {

    @FXML
    void regresarMenu() {
        Main.setFXML("Menu", "Menu");
    }

    @FXML
    void Mostrar(MouseEvent event) {

        ReporteJasper informe = new ReporteJasper();
        informe.reporteMes();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        double a;
        double b;
        double dif;
        double resta;
        double total;

        diferenciaDAO diferenciaDAO = new diferenciaDAO();
        FujoDineroDAO flujodao = new FujoDineroDAO();
        margenDAO margen = new margenDAO();
        diferenciaDAO.truncate();
        margen.truncateDos();

        //operaciones
      /*  for (int x = 1; x < 5; x++) {

        }*/
        a = flujodao.sacarTotal1(5);
        b = flujodao.sacarTotal2(5);
        dif = (a - b);
        System.out.println("diferencia: " + dif);
        diferencia diferencia = new diferencia(5, dif);
        boolean resultado = diferenciaDAO.insert(diferencia);
        if (dif != 0) {
            resta = (a - b);
            System.out.println("resta: " + resta);
            total = (resta / a);
            System.out.println("total1: " + total);
            total = (total * 100);
            System.out.println("total2: " + total);

        } else {
            total = 0;
        }
        margen margen1 = new margen(5, total);
        boolean resultado2 = margen.insert(margen1);
    }
}