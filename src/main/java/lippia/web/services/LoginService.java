package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.SuperiorNavigationBarConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.util.Assert;

import static lippia.web.constants.SuperiorNavigationBarConstants.MY_ACCOUNT_BUTTON;

public class LoginService extends WebActionManager {

    public static void registro(String emailOUsuario, String pass) {
        setInput(LoginConstants.EMAIL_USUARIO, emailOUsuario);
        setInput(LoginConstants.PASSWORD, pass);
        ToolsService.click(LoginConstants.LOGIN_BUTTON);
    }

}


