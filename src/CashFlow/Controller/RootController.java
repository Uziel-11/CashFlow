package CashFlow.Controller;

import CashFlow.Main;
import CashFlow.Model.user;
import CashFlow.Model.userDao;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RootController {


    @FXML
    private TextField userName;

    @FXML
    private TextField password;

    @FXML
    void ingresar(MouseEvent event) {
        String nombrepa= userName.getText();
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

}
