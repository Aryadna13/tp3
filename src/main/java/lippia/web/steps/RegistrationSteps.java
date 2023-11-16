package lippia.web.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.RegistrationConstants;
import lippia.web.services.RegistrationService;
import lippia.web.services.ToolsService;
import org.springframework.util.Assert;

public class RegistrationSteps {
    @When("el usuario ingresa un Email (.*), (.*) y clickea en el register button")
    public void elUsuarioIngresaUnEmailYClickeaEnElRegisterButton(String arg0, String arg1) {
        RegistrationService.registration1(arg0, arg1);
    }


    @Then("la registracion debera fallar y se mostrara un mensaje de aviso (.*)")
    public void laRegistracionDeberaFallarYSeMostraraUnMensajeDeAviso(String arg0) {
        ToolsService.AssertTrue(RegistrationConstants.ERROR);
    }
}
