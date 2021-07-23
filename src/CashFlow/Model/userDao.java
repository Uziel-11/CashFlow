package CashFlow.Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class userDao {
    private Connection connection = null;
    private final int ACCEPT = 1;

    public userDao() {
        AdapterMySQL conector = new AdapterMySQL();
        connection = conector.getConnection();
    }


    public user getUser(String usuario) {
        user user = null;
        if (connection != null) {
            String sql = "select * from usuario where usuario=?";
            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, usuario);
                ResultSet results = statement.executeQuery();
                results.next();
                if (results.getRow() == ACCEPT) {
                    user = new user();
                    user.setIdUsuario(results.getInt(1));
                    user.setUsuario(results.getString(2));
                    user.setContrasenia(results.getString(3));
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return user;

    }


}