package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import com.github.jknack.handlebars.internal.lang3.ObjectUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class LoginSteps {


    @Given("el usuario clickea en el botón My account")
    public void elUsuarioClickeaEnElBotonMyAccount() {
        SuperiorBarNavigationBarService.clickMyAccountBar();
    }
    @When("el usuario ingresa un email o usuario registrado (.*)$")
    public void elUsuarioIngresaUnEmailOUsuarioRegistrado(String emailOUsuario) {
        LoginService.datosEmailUsuario(emailOUsuario);
    }
    @And("el usuario ingresa su contraseña (.*)$")
    public void elUsuarioIngresaSuContrasena(String contrasena) {
        LoginService.datosContrasenaUsuario(contrasena);
    }

    @And("el usuario clickea en el boton de Login")
    public void elUsuarioClickeaEnElBotonDeLogin() {
        LoginService.botonDeLogin();
    }
    @Then("el usuario podrá acceder a su cuenta y sera redirigido a otra página")
    public void elUsuarioPodraAccederASuCuentaYSeraRedirigidoAOtraPagina() {
        LoginService.usuarioBienvenida();
    }
    @When("el usuario ingresa un email o usuario no valido (.*)$")
    public void elUsuarioIngresaUnEmailOUsuarioNoValido(String usuarioIncorrecto) {
        LoginService.datosEmailUsuario(usuarioIncorrecto);
    }

    @Then("el usuario no podrá acceder a su cuenta")
    public void elUsuarioNoPodraAccederASuCuenta() {
        LoginService.mensajeError();
    }



}
