package CashFlow.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class subCategoriaDao {
    private Connection connection = null;
    private final int ACCEPT = 1;

    public subCategoriaDao(){
        AdapterMySQL conector = new AdapterMySQL();
        connection = conector.getConnection();
    }

    public subCategoria getSubCategorias(int idSubCategoria) {
       subCategoria subcategoria = null;
        if (connection != null) {
            String sql = "select * from subcategoria where idSubCategoria=?";
            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, idSubCategoria);
                ResultSet results = statement.executeQuery();
                results.next();
                if (results.getRow() == ACCEPT) {
                    subcategoria = new subCategoria();
                    subcategoria.setIdSubCategoria(results.getInt(1));
                    subcategoria.setNombre(results.getString(2));

                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return subcategoria;
    }

    public boolean insert(subCategoria subcat) {
        boolean resultado = false;
        if (connection != null) {

            String sql = "insert into subcategoria values(?,?)";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, subcat.getIdSubCategoria());
                statement.setString(2, subcat.getNombre());
                if (statement.executeUpdate() == ACCEPT)
                    resultado = true;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return resultado;
    }

    public subCategoria getSubCat(String nombreSub) {
       subCategoria subcategoria = null;
        if (connection != null) {
            String sql = "select * from subcategoria where nombre=?";
            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1,nombreSub );
                ResultSet results = statement.executeQuery();
                results.next();
                if (results.getRow() == ACCEPT) {
                    subcategoria = new subCategoria();
                    subcategoria.setIdSubCategoria(results.getInt(1));
                    subcategoria.setNombre(results.getString(2));
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return subcategoria;
    }
}
