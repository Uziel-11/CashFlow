package CashFlow.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import CashFlow.Model.*;

public class GestionDAO {

    private Connection connection = null;
    private final int ACCEPT = 1;

    public GestionDAO (){
        AdapterMySQL conector = new AdapterMySQL();
        connection = conector.getConnection();
    }


    public boolean guardar(Gestion gestion){


        boolean resultado = false;

        if (connection != null){
            String sql = "INSERT INTO gestiondinero VALUES(?,?,?,?,?,?)";

            try {

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, gestion.getIdGestionDinero());
                statement.setInt(2, gestion.getNumSemana());
                statement.setString(3, gestion.getRazonSocial());
                statement.setDouble(4, gestion.getMonto());
                statement.setString(5, gestion.getMes());
                statement.setString(6, gestion.getTipo());

                if (statement.executeUpdate() == ACCEPT){
                    resultado = true;
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultado;
    }


}
