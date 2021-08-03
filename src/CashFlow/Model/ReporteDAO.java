package CashFlow.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReporteDAO {

    private Connection connection = null;
    private final int ACCEPT = 1;

    public ReporteDAO(){
        AdapterMySQL conector = new AdapterMySQL();
        connection = conector.getConnection();
    }


    public ObservableList<valoresTabla> cuentasCobrar(){
        ObservableList<valoresTabla> datos = FXCollections.observableArrayList();

        return datos;
    }

    public ObservableList<valoresTabla> cuentasPagar(){
        ObservableList<valoresTabla> datos = FXCollections.observableArrayList();

        return datos;
    }


    public ObservableList<valoresTabla> bancos(){
        ObservableList<valoresTabla> datos = FXCollections.observableArrayList();

        return datos;
    }
}
