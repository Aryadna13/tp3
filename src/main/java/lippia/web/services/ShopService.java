package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;
import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ShopService { public static String PRODUCT_CATEGORY_JAVASCRIPT = "xpath://*[@id='woocommerce_product_categories-2']/ul/li[3]/a";
public static String PRODUCT_CATEGORY_ELEGIDO = "xpath://*[@id='woocommerce_product_categories-2']/ul/li[contains(concat(' ',normalize-space(@class),' '),' current-cat ')]/a";
public static String BREADCRUMB_ELEGIDO = "xpath://*[@id='content']/nav/";

public static void javaCategory() {
    click(PRODUCT_CATEGORY_JAVASCRIPT);
}

    public static void comparaciones() {
   WebElement locator1 = getElement(PRODUCT_CATEGORY_ELEGIDO); //JavaScript
    WebElement locator2 = getElement(BREADCRUMB_ELEGIDO); //&nbsp;/&nbsp;JavaScript

        System.out.println(locator1.getText());
        System.out.println(locator2.getText());
//
//        //remplazar if por asserts
//    if (locator1 == locator2) {
//        System.out.println("Los resultados de product category han sido filtrados correctamente");
//    }else {
//        System.out.println("Revisar el filtro de categoria");
//    }
//    }

//clickear en boton java category
//el usuario podra ver solo lo filtrado


  //  public static String PRECIO_MIN = "xpath: //*[@id=/'woocommerce_price_filter-2/']/form/div/div[2]/div[1]/span[1]";
//  public static String PRECIO_MAX = "xpath: //*[@id=/'woocommerce_price_filter-2/']/form/div/div[2]/div[1]/span[2]";
//    public static String BARRITA_MIN = "xpath://*[@id=/'woocommerce_price_filter-2/']/form/div/div[1]/span[1]";


//         public static String PRECIO_MIN = "xpath://*[@id='min_price']";
//        public static String PRECIO_MAX = "xpath://*[@id='max_price']";
//        public static String BOTON_FILTER = "xpath://*[@id='woocommerce_price_filter-2']/form/div/div[2]/button";
//
//
//    public static void filterByPrice(int minimo, int maximo) {

        // navigateTo("https://practice.automationtesting.in/shop/?min_price="+minimo+"&max_price="+maximo);

//        setInput(PRECIO_MIN, String.valueOf(minimo));
//        setInput(PRECIO_MAX, String.valueOf(maximo));



        //como hago para escribir en un elemento invisible? no se puede
        //se puede llamar input clean para que limpies todos los datos precargados

//        setInput(WebElement element, String value, Boolean click, Boolean clear) {
//        setInput(PRECIO_MIN,String.valueOf(minimo),true,true);
//        setInput(getElement(PRECIO_MAX),String.valueOf(maximo),true,true);

    // WebElement caminitoMin;

     //caminitoMin = getElement(PRECIO_MIN);

//            caminitoMin.click();

//            caminitoMin.clear();
//
//            caminitoMin.sendKeys(new CharSequence[]{String.valueOf(minimo)});
//
////
////
//        WebElement caminitoMax = getElement(PRECIO_MAX);
//
////        caminitoMax.click();
//
//        caminitoMax.clear();
//
//        caminitoMax.sendKeys(new CharSequence[]{String.valueOf(maximo)});
//    }

   // public static void botonDeFiltro() {
      //  click(BOTON_FILTER);
    }


}
    //public static void botonDeFiltro(FILTER_BUTTON) {
      //  WebActionManager.click();

