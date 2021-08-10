package co.com.choucair.certification.BaseJ.stepdefinitions;

import co.com.choucair.certification.BaseJ.Model.AcademyChoucarData;
import co.com.choucair.certification.BaseJ.Questions.Answer;
import co.com.choucair.certification.BaseJ.task.Login;
import co.com.choucair.certification.BaseJ.task.Search;
import co.com.choucair.certification.BaseJ.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^for chocair because I want to learn automation in this Choucair Academy$")
    public void forChocairBecauseIWantToLearnAutomationInThisChoucairAcademy(List<AcademyChoucarData> academyChoucarData) throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), Login.OnThePage(academyChoucarData.get(0).getStrUser(), academyChoucarData.get(0).getStrPassword()));

    }

    @When("^I search for a job as an Financial Analist at Bancolombia$")
    public void iSearchForAJobAsAnFinancialAnalistAtBancolombia(List<AcademyChoucarData> academyChoucarData) throws Exception  {
            OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucarData.get(0).getSrtCourse()));
    }

    @Then("^I was send this course called$")
    public void iWasSendThisCourseCalledTechnicalGuidesFuntionalAnalist(List<AcademyChoucarData> academyChoucarData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucarData.get(0).getSrtCourse())));
    }
}


