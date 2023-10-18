package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;


public class SuperiorBarNavigationBarService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));}
    public static void navegarShopPageButton(){
        navigateTo("https://practice.automationtesting.in/shop/");
    }
    public static void clickShopBar( ) {
        WebActionManager.click( SHOP_MENU_BUTTON );
    }
    public static void clickMyAccountBar( ) {
        WebActionManager.click(MY_ACCOUNT_BUTTON);
    }
}
