package CashFlow.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CashFlow.Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GestionDAO {

    private Connection connection = null;
    private final int ACCEPT = 1;

    public GestionDAO (){
        AdapterMySQL conector = new AdapterMySQL();
        connection = conector.getConnection();
    }


    public boolean guardar1(Gestion gestion){


        boolean resultado = false;

        if (connection != null){
            String sql = "insert into gestiondinero(idGestionDinero, razonSocial, semana1, mes, tipo) values(?,?,?,?,?)";

            try {

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, gestion.getIdGestionDinero());
                statement.setString(2, gestion.getRazonSocial());
                statement.setDouble(3, gestion.getSemana1());
                statement.setString(4, gestion.getMes());
                statement.setString(5, gestion.getTipo());

                if (statement.executeUpdate() == ACCEPT){
                    resultado = true;
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultado;
    }

    public boolean guardarSm2(Gestion gestion){


        boolean resultado = false;

        if (connection != null){
            String sql = "insert into gestiondinero(idGestionDinero, razonSocial, semana2, mes, tipo) values(?,?,?,?,?)";

            try {

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, gestion.getIdGestionDinero());
                statement.setString(2, gestion.getRazonSocial());
                statement.setDouble(3, gestion.getSemana1());
                statement.setString(4, gestion.getMes());
                statement.setString(5, gestion.getTipo());

                if (statement.executeUpdate() == ACCEPT){
                    resultado = true;
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultado;
    }

    public boolean guardarSm3(Gestion gestion){


        boolean resultado = false;

        if (connection != null){
            String sql = "insert into gestiondinero(idGestionDinero, razonSocial, semana3, mes, tipo) values(?,?,?,?,?)";

            try {

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, gestion.getIdGestionDinero());
                statement.setString(2, gestion.getRazonSocial());
                statement.setDouble(3, gestion.getSemana1());
                statement.setString(4, gestion.getMes());
                statement.setString(5, gestion.getTipo());

                if (statement.executeUpdate() == ACCEPT){
                    resultado = true;
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultado;
    }
    public boolean guardarSm4(Gestion gestion){


        boolean resultado = false;

        if (connection != null){
            String sql = "insert into gestiondinero(idGestionDinero, razonSocial, semana4, mes, tipo) values(?,?,?,?,?)";

            try {

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, gestion.getIdGestionDinero());
                statement.setString(2, gestion.getRazonSocial());
                statement.setDouble(3, gestion.getSemana1());
                statement.setString(4, gestion.getMes());
                statement.setString(5, gestion.getTipo());

                if (statement.executeUpdate() == ACCEPT){
                    resultado = true;
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultado;
    }

    public boolean guardarSm5(Gestion gestion){


        boolean resultado = false;

        if (connection != null){
            String sql = "insert into gestiondinero(idGestionDinero, razonSocial, semana5, mes, tipo) values(?,?,?,?,?)";

            try {

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, gestion.getIdGestionDinero());
                statement.setString(2, gestion.getRazonSocial());
                statement.setDouble(3, gestion.getSemana1());
                statement.setString(4, gestion.getMes());
                statement.setString(5, gestion.getTipo());

                if (statement.executeUpdate() == ACCEPT){
                    resultado = true;
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultado;
    }


    public ObservableList<valoresTabla> getCpC(String mes1) {
        ObservableList<valoresTabla> flujo = FXCollections.observableArrayList();
        double s1=0; double s2=0;double s3=0;double s4=0;double s5=0; double tot=0;
        if (connection != null) {
            String sql = "select razonsocial, sum(semana1), sum(semana2), sum(semana3), sum(semana4), sum(semana5)\n" +
                    "from gestiondinero where mes = ? and tipo = 'cuentas por cobrar'\n" +
                    "group  by razonSocial";

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
    public ObservableList<valoresTabla> getCpP(String mes1) {
        ObservableList<valoresTabla> flujo = FXCollections.observableArrayList();
        double s1=0; double s2=0;double s3=0;double s4=0;double s5=0; double tot=0;
        if (connection != null) {
            String sql = "select razonsocial, sum(semana1), sum(semana2), sum(semana3), sum(semana4), sum(semana5)\n" +
                    "from gestiondinero where mes = ? and tipo = 'cuentas por pagar'\n" +
                    "group  by razonSocial";

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

    public ObservableList<valoresTabla> getBan(String mes1) {
        ObservableList<valoresTabla> flujo = FXCollections.observableArrayList();
        double s1=0; double s2=0;double s3=0;double s4=0;double s5=0; double tot=0;
        if (connection != null) {
            String sql = "select razonsocial, sum(semana1), sum(semana2), sum(semana3), sum(semana4), sum(semana5)\n" +
                    "from gestiondinero where mes = ? and tipo = 'banco'\n" +
                    "group  by razonSocial";

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
