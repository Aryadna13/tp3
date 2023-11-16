package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ShopConstants;
import lippia.web.constants.SuperiorNavigationBarConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;
import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ShopService extends ToolsService{

    public static void shopBar() {
        WebActionManager.click(SuperiorNavigationBarConstants.SHOP_MENU_BUTTON);
    }

    public static void clickAddToBasket() {
       ToolsService.click(ShopConstants.ADD_TO_BASKET_BUTTON);
    }

    public static void viewBasket() {
        ToolsService.click(ShopConstants.VIEW_BASKET);
    }

    public static void proceedToCheckOut() {
      ToolsService.click(ShopConstants.PROCEED_TO_CHEEKOUT_BUTTON);
    }

    public static void orderDetail(String FirstName, String LastName, String EmailAddress, String Phone, String Country, String Address, String TownDistrict, String Region, String Postcode) {
        setInput(ShopConstants.BILLINGDETAILS_FIRST_NAME, FirstName);
        setInput(ShopConstants.BILLINGDETAILS_LAST_NAME, LastName);
        setInput(ShopConstants.BILLINGDETAILS_EMAIL, EmailAddress);
        setInput(ShopConstants.BILLINGDETAILS_PHONE, Phone);

        ToolsService.click(ShopConstants.BOTON_COUNTRY_DROP);
        setInput(ShopConstants.BUSQUEDA_COUNTRY_ARGENTINA, Country);
        ToolsService.click(ShopConstants.PRIMERA_OPCION);

        setInput(ShopConstants.BILLINGDETAILS_ADRESS, Address);
        setInput(ShopConstants.BILLINGDETAILS_TOWN_DISTRICT_TEXTBOX, TownDistrict);

        ToolsService.click(ShopConstants.BOTON_STATE_DROP);
        setInput(ShopConstants.BILLINGDETAILS_STATE_TEXTBOX, Region);
        ToolsService.click(ShopConstants.BILLINGDETAILS_STATE_MENDOZA);


        setInput(ShopConstants.BILLINGDETAILS_POSTCODE, Postcode);
        ToolsService.click(ShopConstants.CLICKEABLE_DIRECT_BANK_TRANSFER);
    }

    public static void placeOrder() {
        ToolsService.click(ShopConstants.PLACE_ORDER_BUTTON);
    }

    public static void detallesDeCompra(){
        WebActionManager.waitVisibility(ShopConstants.ORDER_DETAILS_PAGE);
        Assert.assertTrue(isPresent(ShopConstants.ORDER_DETAILS_PAGE));
    }

    public static void comparacion() {
        boolean comparacion;
        String PrecioTotal = WebActionManager.getText(ShopConstants.Total);
        PrecioTotal = borrarPrimerCaracter(PrecioTotal);
        int total = obtenerNumeroSinDecimales(PrecioTotal);
        String PrecioSubtotalTotal = WebActionManager.getText(ShopConstants.SubTotal);
        PrecioSubtotalTotal = borrarPrimerCaracter(PrecioSubtotalTotal);
        int subtotal = obtenerNumeroSinDecimales(PrecioSubtotalTotal);
        Assert.assertNotEquals(total, subtotal);
        if(total > subtotal){
            comparacion = true;
        }else{
            comparacion = false;
        }
        Assert.assertTrue(comparacion);
    }

    public static void porcentaje() {
        String subSubTotal = WebActionManager.getText(ShopConstants.SubTotal);
        subSubTotal = borrarPrimerCaracter(subSubTotal);
        int subTotal = obtenerNumeroSinDecimales(subSubTotal);
        int porcentaje = 2;
        int porcentajeTotal = 100;
        int result = (subTotal * porcentaje) / porcentajeTotal;
        String TaxPrice = WebActionManager.getText(ShopConstants.Tax);
        TaxPrice = borrarPrimerCaracter(TaxPrice);
        Assert.assertEquals(result, obtenerNumeroSinDecimales(TaxPrice));
    }
}