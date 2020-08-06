package stepsdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.BuscarProducto;
import userinterfaces.HomePage;

import java.util.List;

public class PruebaBanistmoSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Banistmo");
    private HomePage homePage = new HomePage();

    @Dado("^algo$")
    public void algo() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^esto se de con este (.*), (.*)$")
    public void estoSeDeConEsteDato(String dato1, String dato2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(dato1, dato2)
        );
    }

    @Entonces("^algo mas$")
    public void algoMas() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Cuando("^esto se de lista$")
    public void estoSeDeLista(List<String> datos) {
    //public void estoSeDe(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        //throw new PendingException();
    }

    @Entonces("^pasa algo$")
    public void pasaAlgo() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
