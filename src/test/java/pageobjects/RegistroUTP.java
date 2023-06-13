package pageobjects;

import definitions.Hooks;
import org.openqa.selenium.By;

public class RegistroUTP extends Hooks {

    By txtEmail = By.id("email");
    By txtPassword = By.id("password");
    By btnRegistro = By.id("register");
    By mensajeRegistro = By.id("msg");
    public RegistroUTP(){
        super(driver);
    }

    public void ingresarEmail(String email){
        enterText(txtEmail,email);
    }

    public void ingresarPassword(String clave){
        enterText(txtPassword,clave);
    }

    public void seleccionarRegistro(){
        click(btnRegistro);
    }

    public boolean compararMensaje(String mensaje){
        return getTextCompare(mensajeRegistro,mensaje);
    }

}
