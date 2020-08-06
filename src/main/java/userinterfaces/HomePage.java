package userinterfaces;

//import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//@DefaultUrl("http://www.google.com")
@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class HomePage extends PageObject {

    //public static final Target INPUT_BUSCAR_DATO = Target.the("Input donde se realiza la busqueda").located(By.name("q"));
    //public static final Target BUTTON_BUSCAR_DATO = Target.the("Button donde se realiza la busqueda").located(By.name("btnK"));
    public static final Target ENLACE_TARIFARIO = Target.the("Input donde se realiza la busqueda").located(By.linkText("Tarifario"));
    //public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("//table[class=\"table-responsive\"]/a[3]"));
    //public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("//table[@class=\"table-responsive\"]//a[contains(@href,\"/wps/wcm/connect/ac735c4e-a3fc-4ac4-95fe-627c7fd4d337/S83-Tarifario-TDCTDD-julio2020+-+WEB+%281%29+%281%29.pdf?MOD=AJPERES&amp;CVID=ndTZuDZ\")"));
    //public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("xpath=//a[contains(@href,'/wps/wcm/connect/ac735c4e-a3fc-4ac4-95fe-627c7fd4d337/S83-Tarifario-TDCTDD-julio2020+-+WEB+%281%29+%281%29.pdf?MOD=AJPERES&amp;CVID=ndTZuDZ')]"));
    public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("//table[@class='table-responsive']/a[@href='/wps/wcm/connect/ac735c4e-a3fc-4ac4-95fe-627c7fd4d337/S83-Tarifario-TDCTDD-julio2020+-+WEB+%281%29+%281%29.pdf?MOD=AJPERES&amp;CVID=ndTZuDZ']"));

}
