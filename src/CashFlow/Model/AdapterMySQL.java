package CashFlow.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdapterMySQL {
    public Connection getConnection() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/cashflow?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
        String user = "user.bd";
        String password = "12345";

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;

    }


    }

