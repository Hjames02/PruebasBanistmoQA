package userinterfaces;

//import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//@DefaultUrl("http://www.google.com")
@DefaultUrl("https://www.grupobancolombia.com/")
public class HomePage extends PageObject {

    //public static final Target ENLACE_CERRAR = Target.the("Input donde se realiza la busqueda").located(By.className("header-top_link"));
    public static final Target ENLACE_ACERCANOSOTROS = Target.the("Input donde se realiza la busqueda").located(By.id("header-nosotros"));
    public static final Target ENLACE_INFORMACIONCORPORATIVA = Target.the("Input donde se realiza la busqueda").located(By.id("serv"));
    //public static final Target INPUT_BUSCAR_DATO = Target.the("Input donde se realiza la busqueda").located(By.name("q"));
    //public static final Target BUTTON_BUSCAR_DATO = Target.the("Button donde se realiza la busqueda").located(By.name("btnK"));
    public static final Target ENLACE_PROVEEDORES = Target.the("Input donde se realiza la busqueda").located(By.xpath("//a[@href='/wps/portal/acerca-de/informacion-corporativa/proveedores/']"));
    public static final Target ENLACE_DESCARGAS = Target.the("Input donde se realiza la busqueda").located(By.xpath("//a[@href='/wps/wcm/connect/f7a3486a-41af-46b9-8157-2fde21fa4d0a/poli%CC%81ticas-tratamiento-y-proteccio%CC%81n-de-datos-personales-de-proveedores-grupo-bancolombia.pdf.pdf?MOD=AJPERES&CVID=l33Qn2Y']"));

    //public static final Target ENLACE_NEGOCIOS = Target.the("Input donde se realiza la busqueda").located(By.linkText("Negocios"));
    //public static final Target ENLACE_HERRAMIENTAS = Target.the("Input donde se realiza la busqueda").located(By.linkText("Herramientas"));

    //public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("//table[class=\"table-responsive\"]/a[3]"));
    //public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("//table[@class=\"table-responsive\"]//a[contains(@href,\"/wps/wcm/connect/ac735c4e-a3fc-4ac4-95fe-627c7fd4d337/S83-Tarifario-TDCTDD-julio2020+-+WEB+%281%29+%281%29.pdf?MOD=AJPERES&amp;CVID=ndTZuDZ\")"));
    //public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("xpath=//a[contains(@href,'/wps/wcm/connect/ac735c4e-a3fc-4ac4-95fe-627c7fd4d337/S83-Tarifario-TDCTDD-julio2020+-+WEB+%281%29+%281%29.pdf?MOD=AJPERES&amp;CVID=ndTZuDZ')]"));
    //public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("//table[@class='table-responsive']/a[@href='/wps/wcm/connect/ac735c4e-a3fc-4ac4-95fe-627c7fd4d337/S83-Tarifario-TDCTDD-julio2020+-+WEB+%281%29+%281%29.pdf?MOD=AJPERES&amp;CVID=ndTZuDZ']"));
    //public static final Target ENLACE_PDF = Target.the("Input donde se realiza la busqueda").located(By.xpath("//a[@href='/wps/wcm/connect/ac735c4e-a3fc-4ac4-95fe-627c7fd4d337/S83-Tarifario-TDCTDD-julio2020+-+WEB+%281%29+%281%29.pdf?MOD=AJPERES&CVID=ndTZuDZ']"));
    //public static final Target ENLACE_NEGOCIOS = Target.the("Input donde se realiza la busqueda").located(By.xpath("//a[@href='/wps/portal/negocios']"));

    /*public static final Target ENLACE_CONVERSORTDI = Target.the("Input donde se realiza la busqueda").located(By.xpath("//a[@href='/wps/portal/negocios-pymes/herramientas/conversor-tasas/']"));
    public static final Target ENLACE_CALCULARTE = Target.the("Input donde se realiza la busqueda").located(By.id("btntoolUno"));
    public static final Target INPUT_TASADEINTERES = Target.the("Input donde se realiza la busqueda").located(By.id("interes"));
    public static final Target SELECT_PERIODICIDAD = Target.the("Input donde se realiza la busqueda").located(By.id("periodicidad-deseada"));
    public static final Target SELECT_CAPITALIZACION = Target.the("Input donde se realiza la busqueda").located(By.id("capitalizacion"));*/

    //public static final Target LABEL_RESPUESTA = Target.the("Input donde se realiza la busqueda").located(By.id("respuesta"));
}
