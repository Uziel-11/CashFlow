package CashFlow.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

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
                    int idFlujodinero = results.getInt(1);
                    String fecha = results.getString(2);
                    String descripcion = results.getString(3);
                    String categoria = results.getString(4);
                    String subCat = results.getString(5);
                    int cantidad = results.getInt(6);

                    FlujoDinero flujoDinero = new FlujoDinero(idFlujodinero, fecha, descripcion, categoria, subCat, cantidad);
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

            String sql = "insert into flujodinero values(?,?,?,?,?,?)";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, flujo.getIdflujoDinero());
                statement.setString(2, String.valueOf(fechaPC));
                statement.setString(3, flujo.getDescripcion());
                statement.setString(4, flujo.getCategoria());
                statement.setString(5, "");
                statement.setInt(6, flujo.getCantidad());
                if (statement.executeUpdate() == ACCEPT)
                    resultado = true;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return resultado;
    }

}
