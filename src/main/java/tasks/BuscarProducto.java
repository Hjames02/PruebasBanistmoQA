package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class BuscarProducto implements Task {

    private String dato1, dato2;
    public BuscarProducto(String dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    //public static Performable conDescripcion(String dato) {
    public static BuscarProducto conDescripcion(String dato1, String dato2) {
        return  instrumented(BuscarProducto.class, dato1, dato2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.theValue(dato1).into(INPUT_BUSCAR_DATO),
                //SelectFromOptions.byVisibleText(dato2).from(),
                //Hit.the(Keys.ENTER).into(BUTTON_BUSCAR_DATO)
                Click.on(ENLACE_NEGOCIOS),
                Click.on(ENLACE_HERRAMIENTAS),
                Click.on(ENLACE_CONVERSORTDI),
                Click.on(ENLACE_CALCULARTE),
                Enter.theValue(dato1).into(INPUT_TASADEINTERES),
                SelectFromOptions.byIndex(2).from(SELECT_PERIODICIDAD),
                SelectFromOptions.byIndex(3).from(SELECT_CAPITALIZACION)
                //Click.on(ENLACE_PDF)
        );
    }
}
