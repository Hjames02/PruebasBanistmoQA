package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/PruebaBanistmo.feature",
        glue = "stepsdefinitions",
        tags = "@EscenarioSinEjemplos",
        snippets = SnippetType.CAMELCASE
)
public class PruebaBanistmoRunners {

}
