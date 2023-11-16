package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.SuperiorNavigationBarConstants;
import lippia.web.services.LoginService;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;
import lippia.web.services.ToolsService;
import org.openqa.selenium.WebDriver;
import org.springframework.util.Assert;

public class LoginSteps {

    @And("el usuario cambia de pagina")
    public static void elUsuarioCambiaDePagina() {
        ShopService.shopBar();
    }

    @Then("el usuario no podrá acceder a su cuenta (.*)")
    public void elUsuarioNoPodraAccederASuCuenta(String arg0) {
        ToolsService.AssertTrue(LoginConstants.MENSAJE_ERROR);
         }


    @Then("el usuario no debera loguearse de nuevo y podra ver la pagina con normalidad")
    public void elUsuarioNoDeberaLoguearseDeNuevoYPodraVerLaPaginaConNormalidad() {
        ToolsService.AssertTrue(SuperiorNavigationBarConstants.MY_ACCOUNT_BUTTON);
    }
}
