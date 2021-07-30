package CashFlow.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class margenDAO {
    private Connection connection = null;
    private final int ACCEPT = 1;

    public margenDAO() {
        AdapterMySQL conector = new AdapterMySQL();
        connection = conector.getConnection();
    }

    public boolean insert(margen margen) {
        boolean resutado = false;
        if (connection != null) {
            String sql = "insert into margen values (?,?)";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1,margen.getNoSemana());
                statement.setDouble(2,margen.getCantidad());
                if (statement.executeUpdate() == ACCEPT)
                    resutado = true;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return resutado;
    }

    public void truncateDos() {
        if (connection != null) {
            String sql = "delete from margen";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

