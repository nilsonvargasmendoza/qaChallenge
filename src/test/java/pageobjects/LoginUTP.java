package pageobjects;

import definitions.Hooks;
import org.openqa.selenium.By;

public class LoginUTP extends Hooks {

    By txtEmail = By.id("email");
    By txtPassword = By.id("password");
    By btnLogin = By.id("login");
    By mensajeLogin = By.id("msg");

    public LoginUTP(){
        super(driver);
    }

    public void ingresarEmail(String email){
        enterText(txtEmail,email);
    }

    public void ingresarPassword(String clave){
        enterText(txtPassword,clave);
    }

    public void seleccionarLogin(){
        click(btnLogin);
    }

    public boolean compararMensaje(String mensaje){
        return getTextCompare(mensajeLogin,mensaje);
    }

}
