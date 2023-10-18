package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.WebElement;

public class LoginService extends WebActionManager {


    public static String EMAIL_USUARIO = "xpath://*[@id='username']";
    public static String CONTRASENA = "xpath://*[@id='password']";
    public static String LOGIN_BUTTON = "xpath://*[@id='customer_login']/div[1]/form/p[3]/input[3]";

    public static String MENSAJE_ERROR = "xpath://*[@id=\"page-36\"]/div/div[1]/ul[@class=\"woocommerce-error\"]";

    public static String MENSAJE_BIENVENIDA= "xpath//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong";
    public static void MyAccountButton() {
        SuperiorBarNavigationBarService.clickMyAccountBar();
    }
    public static void datosEmailUsuario(String emailOUsuario){
    setInput(EMAIL_USUARIO,emailOUsuario);
    }
    public static void datosContrasenaUsuario(String contrasena){
        setInput(CONTRASENA,contrasena);
    }
    public static void botonDeLogin(){
        click(LOGIN_BUTTON);
    }

    public static void mensajeError() {
        getElement(MENSAJE_ERROR);
        //Assert de que existe el error
    }

    public static void usuarioBienvenida(){
        WebElement bienvenida = getElement(MENSAJE_BIENVENIDA);
        String usuario = bienvenida.getText();

        if( usuario == "garciaariadna139"){
            System.out.println("usuario correcto");
        }else{
            System.out.println("usuario incorrecto");
        }

    }


//tocar boton my accoun
//    ingresar datos de usuario en un text area
//ingresar datos de contrase;a
//clikear boton de login
    //

}
