package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class HomeSteps extends PageSteps {


    @Given("el usuario ingresa a la URL")
    public void elUsuarioIngresaALaURL() {

        SuperiorBarNavigationBarService.navegarWeb();
    }

    @Given("el usuario clickea en shop menu button")
    public void elUsuarioClickeaEnShopMenuButton() {
        SuperiorBarNavigationBarService.navegarShopPageButton();
    }

    @When("el usuario clickea en home page button")
    public void elUsuarioClickeaEnHomePageButon() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @Then("se valida que en la home page hay solo tres slides")
    public static void seValidaQueEnLaHomePageHaySoloTresSlides() {
        HomeService.slides();
    }

    @Then("se valida que en la home page hay solo tres productos en <new arrivals>")
    public static void seValidaQueEnLaHomePageHaySoloTresProductosEnNewArrivals() {
        HomeService.newArrivalsBox();
    }
}
