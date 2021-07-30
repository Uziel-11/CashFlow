package CashFlow.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
//import java.util.Date;
import java.sql.*;

public class FujoDineroDAO {

    private Connection connection = null;
    private final int ACCEPT = 1;

    public FujoDineroDAO(){
        AdapterMySQL conector = new AdapterMySQL();
        connection = conector.getConnection();
    }

    public ObservableList<FlujoDinero> getFlujoDinero() {
        ObservableList<FlujoDinero> flujo = FXCollections.observableArrayList();

        if (connection != null) {
            String sql = "select * from flujodinero";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet results = statement.executeQuery();
                while (results.next()) {
                    int idFlujoDinero = results.getInt(1);
                    String descripcion = results.getString(2);
                    String categoria = results.getString(3);
                    String subCategoria = results.getString(4);
                    String tipoFlujo = results.getString(5);
                    Double cantidad = results.getDouble(6);
                    Date fecha = results.getDate(7);
                    int numSemana = results.getInt(8);
                    String mes = results.getString(9);


                    FlujoDinero flujoDinero = new FlujoDinero(idFlujoDinero,descripcion,categoria,subCategoria,tipoFlujo,cantidad,fecha,numSemana,mes);
                    flujo.add(flujoDinero);
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return flujo;
    }


    public boolean insertar(FlujoDinero flujo) {
        LocalDate fechaPC =LocalDate.now();
        boolean resultado = false;
        if (connection != null) {

            String sql = "insert into flujodinero values(?,?,?,?,?,?,?,?,?)";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, flujo.getIdFlujoDinero());
                statement.setString(2,flujo.getDescripcion());
                statement.setString(3, flujo.getCategoria());
                statement.setString(4, flujo.getSubcategoria());
                statement.setString(5, flujo.getTipoFlujo());
                statement.setDouble(6, flujo.getCantidad());
                statement.setDate(7, (Date)flujo.getFecha());
                statement.setInt(8,flujo.getNumsemana());
                statement.setString(9,flujo.getMes());
                if (statement.executeUpdate() == ACCEPT)
                    resultado = true;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return resultado;
    }
    public double sacarTotal1(int numSemana) {
        double a = 0;
        if (connection != null){
            String sql = "select sum(cantidad) from flujodinero where mes='julio' and numSemana=? and tipoflujo='entrada'";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1,numSemana);
                ResultSet results = statement.executeQuery();
                if(results.next()) {
                    //Si hay resultados obtengo el valor.
                    a= results.getDouble(1);
                }
                System.out.println(a);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return a;
    }

    public double sacarTotal2(int numSemana) {
        double a = 0;
        if (connection != null){
            String sql = "select sum(cantidad) from flujodinero where mes='julio' and numSemana=? and tipoFlujo='salida'";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1,numSemana);
                ResultSet results = statement.executeQuery();
                if(results.next()) {
                    //Si hay resultados obtengo el valor.
                    a= results.getDouble(1);
                }
                System.out.println(a);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return a;
    }

}
