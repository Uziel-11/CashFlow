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

    public ObservableList<flujoCash> getFlujoDinero() {
        ObservableList<flujoCash> flujo = FXCollections.observableArrayList();

        if (connection != null) {
            String sql = "select * from flujocash";

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
                    int numSemana = results.getInt(7);
                    Date fecha = results.getDate(8);
                    String mes = results.getString(9);


                    flujoCash flujoDinero = new flujoCash(idFlujoDinero,descripcion,categoria,subCategoria,tipoFlujo,cantidad,numSemana,fecha,mes);
                    flujo.add(flujoDinero);
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return flujo;
    }


    public boolean insertar(flujoCash flujo) {
        LocalDate fechaPC =LocalDate.now();
        boolean resultado = false;
        if (connection != null) {

            String sql = "insert into flujocash values(?,?,?,?,?,?,?,?,?)";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, flujo.getIdFlujoDinero());
                statement.setString(2,flujo.getDescripcion());
                statement.setString(3, flujo.getCategoria());
                statement.setString(4, flujo.getSubcategoria());
                statement.setString(5, flujo.getTipoFlujo());
                statement.setDouble(6, flujo.getCantidad());
                statement.setInt(7,flujo.getNumSemana());
                statement.setDate(8, (Date)flujo.getFecha());
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

    public ObservableList<valoresTabla> getIngresosG(String mes1) {
        ObservableList<valoresTabla> flujo = FXCollections.observableArrayList();
        double s1=0; double s2=0;double s3=0;double s4=0;double s5=0; double tot=0;
        if (connection != null) {
            String sql = "SELECT subCategoria, sum(semana1),sum(semana2), sum(semana3), sum(semana4), sum(semana5) from flujodinero join categoria on flujodinero.categoria = categoria.nombre and tipoFlujo = 'entrada'  and flujodinero.mes = ?\n" +
                    "group by subCategoria";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1,mes1);
                ResultSet results = statement.executeQuery();
                while (results.next()) {
                    String subCategoria = results.getString(1);
                    Double semana1 = results.getDouble(2);
                    Double semana2 = results.getDouble(3);
                    Double semana3 = results.getDouble(4);
                    Double semana4 = results.getDouble(5);
                    Double semana5 = results.getDouble(6);


                    double total = semana1 + semana2 +semana3+semana4 + semana5;
                    s1= s1+semana1; s2=s2+semana2; s3=s3+semana3; s4=s4+semana4; s5=s5+semana5;
                    tot=tot+total;
                    valoresTabla data = new valoresTabla(subCategoria, semana1,semana2,semana3,semana4,semana5,total);
                    flujo.add(data);
                }
                valoresTabla data = new valoresTabla("sumTotal",s1,s2,s3,s4,s5,tot);
                flujo.add(data);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return flujo;
    }

    public ObservableList<valoresTabla> getSalida(String mes1) {
        ObservableList<valoresTabla> flujo = FXCollections.observableArrayList();
        double s1=0; double s2=0;double s3=0;double s4=0;double s5=0; double tot=0;
        if (connection != null) {
            String sql = "SELECT subCategoria, sum(semana1),sum(semana2), sum(semana3), sum(semana4), sum(semana5) from flujodinero join categoria on flujodinero.categoria = categoria.nombre and tipoFlujo = 'salida'  and flujodinero.mes = ?\n" +
                    "group by subCategoria";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1,mes1);
                ResultSet results = statement.executeQuery();
                while (results.next()) {
                    String subCategoria = results.getString(1);
                    Double semana1 = results.getDouble(2);
                    Double semana2 = results.getDouble(3);
                    Double semana3 = results.getDouble(4);
                    Double semana4 = results.getDouble(5);
                    Double semana5 = results.getDouble(6);


                    double total = semana1 + semana2 +semana3+semana4 + semana5;
                    s1= s1+semana1; s2=s2+semana2; s3=s3+semana3; s4=s4+semana4; s5=s5+semana5;
                    tot=tot+total;
                    valoresTabla data = new valoresTabla(subCategoria, semana1,semana2,semana3,semana4,semana5,total);
                    flujo.add(data);
                }
                valoresTabla data = new valoresTabla("sumTotal",s1,s2,s3,s4,s5,tot);
                flujo.add(data);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return flujo;
    }

}
