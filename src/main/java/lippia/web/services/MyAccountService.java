package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.SuperiorNavigationBarConstants;

public class MyAccountService extends WebActionManager{
    public static void clickMyAccountBar() {
        WebActionManager.click(SuperiorNavigationBarConstants.MY_ACCOUNT_BUTTON);
    }
    public static void accountD() {
        WebActionManager.click(MyAccountConstants.ACCOUNT_DETAILS);
    }
    public static void logOut() {
        WebActionManager.click(MyAccountConstants.LOG_OUT);
    }
}
