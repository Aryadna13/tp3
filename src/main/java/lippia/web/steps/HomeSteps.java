package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.ShopConstants;
import lippia.web.services.HomeService;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;
import lippia.web.services.ToolsService;

import static lippia.web.constants.HomeConstants.PROCEED_TO_CHEEKOUT_BUTTON_ESPECIFICO;
import static lippia.web.constants.HomeConstants.TO_SCROLL_PROCEED_TO_CHECKOUT;

public class HomeSteps extends PageSteps {


    @Given("el usuario ingresa a la URL")
    public void elUsuarioIngresaALaURL() {
        SuperiorBarNavigationBarService.navegarWeb();
    }


    @And("el usuario clickea la imagen de un producto de new arrivals")
    public void elUsuarioClickeaLaImagenDeUnProductoDeNewArrivals() {
        ToolsService.scrollTo1(HomeConstants.NEW_ARRIVALS_BOX);
        HomeService.producto();
    }
    @And("el usuario agrega ese libro especifico a su carrito con el boton Add to basket")
    public void elUsuarioAgregaEseLibroEspecificoASuCarritoConElBotonAddToBasket() {
        HomeService.productoAddtoBasket();
    }

    @When("el usuario clickea en el boton Proceed to Checkout del producto")
    public void elUsuarioClickeaEnElBotonProceedToCheckoutDelProducto() {
        HomeService.proceedToCheckOutEspecifico();
    }
}