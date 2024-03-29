package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\features\\SanAngelBuscador.feature",
		glue = "stepDefinitions",
		snippets = SnippetType.CAMELCASE
		)
    public class SanAngelBuscadorRunners {

}
