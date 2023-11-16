package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.ShopConstants;
import lippia.web.services.HomeService;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;
import lippia.web.services.ToolsService;

public class ShopSteps extends PageSteps {

    @Given("el usuario ingresa a la homepage")
    public void elUsuarioIngresaALaHomepage() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @Given("el usuario clickea en shop menu")
    public void elUsuarioClickeaEnShopMenu() {
        SuperiorBarNavigationBarService.navegarShopPageButton();
    }

    @Given("el usurario clickea en el boton Add to basket de un producto")
    public void elUsurarioClickeaEnElBotonAddToBasketDeUnProducto() {
        ShopService.clickAddToBasket();
    }

    @And("el usuario clickea en el boton View Basket")
    public void elUsuarioClickeaEnElBotonViewBasket() {
        ShopService.viewBasket();
    }


    @And("el usuario clickea en el boton View Basket y es redirigido a la pagina de Checkout")
    public void elUsuarioClickeaEnElBotonViewBasketYEsRedirigidoALaPaginaDeCheckout() {
        ShopService.viewBasket();
    }


    @When("el usuario clickea en el boton Proceed to Checkout")
    public void elUsuarioClickeaEnElBotonProceedToCheckout() {
        ShopService.proceedToCheckOut();
    }

    @And("el usuario debera rellenar los campos de compra de Billing Details (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
    public void elUsuarioDeberaRellenarLosCamposDeCompraDeBillingDetails(String FirstName, String LastName, String EmailAddress, String Phone, String Country, String Address, String TownDistrict, String Region, String Postcode) {
        ShopService.orderDetail(FirstName, LastName, EmailAddress, Phone, Country, Address, TownDistrict, Region, Postcode);
    }

    @And("el usuario clickea en el boton de Place Order")
    public void elUsuarioClickeaEnElBotonDePlaceOrder() {
        ShopService.placeOrder();

    }

    @Then("el usuario es redirigido a una pagina de confirmacion de pedido")
    public void elUsuarioEsRedirigidoAUnaPaginaDeConfirmacionDePedido() {
        ShopService.detallesDeCompra();
    }

    @Then("el usuario podra añadir cupones")
    public void elUsuarioPodraAnadirCupones() {
        HomeService.cupon();
    }


    @And("el usuario clickea en el boton View Basket del producto elegido")
    public void elUsuarioClickeaEnElBotonViewBasketDelProductoElegido() {
        HomeService.productoViewBasket();
    }


    @Then("el usuario podra verificar el impuesto de su compra")
    public void elUsuarioPodraVerificarElImpuestoDeSuCompra() {
        ShopService.comparacion();
        ShopService.porcentaje();
    }
}


