package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import org.junit.Assert;
import pageobjects.*;

public class UsuarioStepsDefinitions {


    LoginUTP login;
    RegistroUTP registro;

    public UsuarioStepsDefinitions() {
        login = new LoginUTP();
        registro = new RegistroUTP();
    }

    @Given("el usuario ingresa a la Web de {string}")
    public void elUsuarioIngresaALaWebDe(String valor) {
        Hooks.driver.get("http://localhost:4000/" + valor + "/");
    }

    @When("el usuario ingresa en el registro su email {string} y password {string}")
    public void elUsuarioIngresaEnElRegistroSuEmailYPassword(String email, String contrasena) {
        registro.ingresarEmail(email);
        registro.ingresarPassword(contrasena);
    }

    @And("el usuario selcciona Register")
    public void elUsuarioSelccionaRegister() {
        registro.seleccionarRegistro();
    }

    @Then("se muestra un mensaje para el registro {string}")
    public void seMuestraUnMensajeParaElRegistro(String mensaje) {
        registro.compararMensaje(mensaje);
    }


    @When("el usuario ingresa email {string} y password {string} para el login")
    public void elUsuarioIngresaEmailYPasswordParaElLogin(String correo, String clave) {
        login.ingresarEmail(correo);
        login.ingresarPassword(clave);
    }

    @And("el usuario selcciona Login")
    public void elUsuarioSelccionaLogin() {
        login.seleccionarLogin();
    }

    @Then("se muestra un mensaje para el login {string}")
    public void seMuestraUnMensajeParaElLogin(String mensaje) {
        login.compararMensaje(mensaje);

    }



}
