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


    public boolean guardar(){

        Gestion gestion = new Gestion();
        boolean resultado = false;

        if (connection != null){
            String sql = "INSERT INTO gestion VALUES(?,?,?,?)";

            try {

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, gestion.getNombre());
                statement.setInt(2, gestion.getNoSemana());
                statement.setString(3, gestion.getRazon());
                statement.setInt(4, gestion.getMonto());

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
