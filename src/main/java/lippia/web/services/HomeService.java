package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.crowdar.core.actions.ActionManager.getElements;
import static lippia.web.constants.HomeConstants.AGREGAR_CUPON;
import static lippia.web.constants.HomeConstants.PROCEED_TO_CHEEKOUT_BUTTON_ESPECIFICO;

//import static lippia.web.constants.SuperiorNavigationBarConstants.HOME_BUTTON;

public class HomeService {

    public static void producto() {
        WebActionManager.click(HomeConstants.PRODUCTO_NEW_ARRIVALS);
    }

    public static void productoAddtoBasket() {
        ToolsService.click(HomeConstants.PRODUCTO_ESPECIFICO_ADD_TO_BASKET);
    }
    public static void productoViewBasket() {
        ToolsService.click(HomeConstants.PRODUCTO_ESPECIFICO_VIEW_BASKET);}

    public static void proceedToCheckOutEspecifico() {
        WebActionManager.click(PROCEED_TO_CHEEKOUT_BUTTON_ESPECIFICO);
    }
    public static void cupon(){
        ToolsService.AssertTrue(AGREGAR_CUPON);
    }


    }

