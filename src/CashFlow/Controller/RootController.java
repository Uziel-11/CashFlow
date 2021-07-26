package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.user;
import CashFlow.Model.userDao;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {


    @FXML
    private TextField userName;

    @FXML
    private TextField password;

    @FXML
    private ImageView image;


    @FXML
    void ingresar(MouseEvent event) {
        String nombrepa = userName.getText();
        String passw= password.getText();

        user usuario = new user();

        userDao dao = new userDao();

        usuario = dao.getUser(nombrepa);

        if(usuario!= null){
            if(usuario.getContrasenia().equals(passw)) {
                Main.setFXML("Menu", "Menu");
            }else {
                System.out.println("la contraseña es incorrecta");
            }

        }else{
            System.out.println("el usuario no coincide");
        }


    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        Image imag = new Image(getClass().getResourceAsStream("../Recursos/logo.jpeg"));
        image.setImage(imag);
    }

}
