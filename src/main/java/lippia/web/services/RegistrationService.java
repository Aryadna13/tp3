package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.RegistrationConstants;
import lippia.web.constants.SuperiorNavigationBarConstants;


public class RegistrationService extends WebActionManager{

    public static void registration1(String emailOUsuario, String pass) {
        setInput(RegistrationConstants.REG_EMAIL_USUARIO, emailOUsuario);
        setInput(RegistrationConstants.REG_PASSWORD, pass);
        WebActionManager.click(RegistrationConstants.REGISTRATION_BUTTON);
    }
}
