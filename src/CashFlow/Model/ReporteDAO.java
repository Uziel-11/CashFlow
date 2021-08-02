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


    public ObservableList<Reporte> cuentasCobrar(){
        ObservableList<Reporte> datos = FXCollections.observableArrayList();

        return datos;
    }

    public ObservableList<Reporte> cuentasPagar(){
        ObservableList<Reporte> datos = FXCollections.observableArrayList();

        return datos;
    }

    public ObservableList<Reporte> ingreso(){
        ObservableList<Reporte> datos = FXCollections.observableArrayList();

        if (connection != null){

            String sql = "";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet results = statement.executeQuery();

                while (results.next()){
                    String descripcion = results.getNString(1);
                    int semana1 = results.getInt(2);
                }


            }catch (Exception e){
                e.printStackTrace();
            }

        }

        return datos;
    }

    public ObservableList<Reporte> gastos(){
        ObservableList<Reporte> datos = FXCollections.observableArrayList();

        return datos;
    }
}
