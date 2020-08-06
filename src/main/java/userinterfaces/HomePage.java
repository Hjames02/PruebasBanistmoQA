package userinterfaces;

//import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://www.google.com")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSCAR_DATO = Target.the("Input donde se realiza la busqueda").located(By.name("q"));
    public static final Target BUTTON_BUSCAR_DATO = Target.the("Button donde se realiza la busqueda").located(By.name("btnK"));

}
