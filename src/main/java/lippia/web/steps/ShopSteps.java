package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {

    @Given("el usuario ingresa a la homepage")
    public void elUsuarioIngresaALaHomepage() {
        SuperiorBarNavigationBarService.navegarWeb();
    }
    @Given("el usuario clickea en shop menu")
    public void elUsuarioClickeaEnShopMenu() {
        SuperiorBarNavigationBarService.navegarShopPageButton();
    }
    @When("el usuario clickea en una opción de Product category")
    public void elUsuarioClickeaEnUnaOpcionDeProductCategory() {
        ShopService.javaCategory();

    }
    @Then("el usuario podra ver solo los productos filtrados")
    public void elUsuarioPodraVerSoloLosProductosFiltrados() {
        ShopService.comparaciones();
    }

    @When("el usurario clickea en el boton Add to basket")
    public void elUsurarioClickeaEnElBotonAddToBasket() {
    }

    @Then("deberá añadirse una unidad del producto elegido a su carrito de compras")
    public void deberáAñadirseUnaUnidadDelProductoElegidoASuCarritoDeCompras() {
    }




//    @When("el usuario ajusta el rango de valor de {int} a {int}")
//    public void elUsuarioAjustaElRangoDeValor(int min, int max) {
//        ShopService.filterByPrice(min, max);
//    }
//
//    @And("el usuario clickea en el botón Filter")
//    public void elUsuarioClickeaEnElBoton() {
////        ShopService.botonDeFiltro();
//    }
//
//    @Then("se mostrarán los productos dentro de ese rango de valor")
//    public void seMostraránLosProductosDentroDeEseRangoDeValor() {
//    }
}


