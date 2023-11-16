package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.javadoc.internal.tool.ToolOptions;
import lippia.web.constants.LoginConstants;
import lippia.web.services.*;

public class MyAccountSteps {

    @Given("el usuario clickea en el botón My account")
    public void elUsuarioClickeaEnElBotonMyAccount() {
        MyAccountService.clickMyAccountBar();
    }

    @When("el usuario ingresa un Email (.*), (.*) y clickea en el login button")
    public void elUsuarioIngresaUnEmailYClickeaEnElLoginButton(String arg0, String arg1) {
        LoginService.registro(arg0, arg1);
    }

    @And("el usuario clickea en el boton Account details")
    public void elUsuarioClickeaEnElBotonAccountDetails() {
        MyAccountService.accountD();
    }

    @Then("el usuario podra ver los detalles de su cuenta")
    public void elUsuarioPodraVerLosDetallesDeSuCuenta() {

    }

    @And("el usuario clickea en el boton Logout")
    public void elUsuarioClickeaEnElBotonLogout() {
        MyAccountService.logOut();
    }

    @Then("el usuario podra desloguearse con exito")
    public void elUsuarioPodraDesloguearseConExito() {
        ToolsService.AssertTrue(LoginConstants.LOGIN_BUTTON);
    }

}
