package lippia.web.services;

import org.openqa.selenium.WebElement;

import java.util.List;

import static com.crowdar.core.actions.ActionManager.getElements;

//import static lippia.web.constants.SuperiorNavigationBarConstants.HOME_BUTTON;

public class HomeService {

//    public static String SLIDE1 = "xpath: "
//    public static String SLIDE2 = "xpath: "
//    public static String SLIDE3 = "xpath: "
//    esos strings son para cada una de las fotos,//quiero hacer click en la --> que se cambie de slide
////quiero que la pagina comparar el xpath de la imagen del slide con MI LISTA ARAMADA DE SLIDES
//public void slidesPorVerificar(){
//        List<String>datitos = new ArrayList<>();
//            datitos.add(SLIDE1);
//            datitos.add(SLIDE2);
//            datitos.add("S");
//            WebActionManager.getElement()

    public static String SLIDES_HOME_PAGE = "xpath://*[@class='n2-ss-slider-3']//img";
    public static String NEW_ARRIVALS_IMAGENES = "xpath://*[@id='themify_builder_content-22']/div[2]//img";
    public static void slides() {

        List<WebElement> imagenes;

        imagenes = getElements(SLIDES_HOME_PAGE);

        int cantidadImagenes;

        cantidadImagenes = imagenes.size();
        System.out.println(cantidadImagenes);

        if (cantidadImagenes==3) {
            System.out.println("Hay imagenes cargadas en los Slides");
        } else {
            System.out.println("No hay imagenes cargadas en los Slides");
        }

    }

    public static void newArrivalsBox(){
        List<WebElement> imagenes;
        imagenes = getElements(NEW_ARRIVALS_IMAGENES);

        int cantidadImagenes;
        cantidadImagenes = imagenes.size();
        System.out.println();

        if (cantidadImagenes==3){
            System.out.println("Hay 3 productos en New Arrivals");}
        else {
            System.out.println("Error, verificar si estan cargadas las imagenes");
        }
    }
}
