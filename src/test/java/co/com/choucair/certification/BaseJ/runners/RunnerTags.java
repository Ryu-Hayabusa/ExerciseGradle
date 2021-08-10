package co.com.choucair.certification.BaseJ.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
                             features = "src/test/resources/features/academyChocair.feature",
                             tags="@stories",
                             glue = "co.com.choucair.certification.BaseJ.stepdefinitions.ChocairAcademyStepDefinitions",
                             snippets=SnippetType.CAMELCASE)

public class RunnerTags {

}
