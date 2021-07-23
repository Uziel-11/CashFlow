package CashFlow.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class categoriasDAO {
    private Connection connection = null;
    private final int ACCEPT = 1;

public categoriasDAO(){
    AdapterMySQL conector = new AdapterMySQL();
    connection = conector.getConnection();
}

    public ObservableList<categorias> getCategorias() {
        ObservableList<categorias> categorias = FXCollections.observableArrayList();

        if (connection != null) {
            String sql = "select * from categoria";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet results = statement.executeQuery();
                while (results.next()) {
                    int idCategoria = results.getInt(1);
                    String clasificacion = results.getString(2);
                    String nombre = results.getString(3);
                    int idSubCategoria = results.getInt(4);

                    categorias cat = new categorias(idCategoria, clasificacion, nombre, idSubCategoria);
                    categorias.add(cat);
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return categorias;
    }


}
