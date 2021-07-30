package CashFlow.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class diferenciaDAO {
    private Connection connection = null;
    private final int ACCEPT = 1;

    public diferenciaDAO() {
        AdapterMySQL conector = new AdapterMySQL();
        connection = conector.getConnection();
    }

    public boolean insert(diferencia diferencia) {
        boolean resutado = false;
        if (connection != null) {
            String sql = "insert into diferencia values (?,?)";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1,diferencia.getNoSemana());
                statement.setDouble(2,diferencia.getCantidad());
                if (statement.executeUpdate() == ACCEPT)
                    resutado = true;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return resutado;
    }

    public void truncate() {
        if (connection != null) {
            String sql = "delete from diferencia";
            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
