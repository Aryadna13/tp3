package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ToolsService extends WebActionManager {

    public static void click(String locatorElement, String... locatorReplacementValue) {
        click(locatorElement, false, locatorReplacementValue);
    }

    public static void scrollTo1(String xpath) {
        JavascriptExecutor javascriptExecutor = DriverManager.getDriverInstance();
        WebElement element = WebActionManager.getElement(xpath);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void AssertTrue(String locator) {
        boolean AssertTrue = WebActionManager.isVisible(locator);
        Assert.assertTrue(AssertTrue);
    }

    public static String borrarPrimerCaracter(String input) {
        if (input != null && input.length() > 0) {
            return input.substring(1);
        } else {
            System.out.println("La cadena es nula o vacía.");
            return input;
        }
    }

    public static int obtenerNumeroSinDecimales(String input) {
        if (input != null && input.contains(".")) {
            int indicePunto = input.indexOf(".");
            String parteEntera = input.substring(0, indicePunto);
            return Integer.parseInt(parteEntera);
        } else {
            System.out.println("La cadena no contiene un punto.");
            return 0;
        }
    }
}




