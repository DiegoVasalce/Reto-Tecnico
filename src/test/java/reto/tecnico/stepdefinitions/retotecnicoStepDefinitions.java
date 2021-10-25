package reto.tecnico.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.tecnico.model.DataTest;
import reto.tecnico.questions.Answer;
import reto.tecnico.tasks.*;

import java.util.List;

public class retotecnicoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Diego wants create a new profile$")
    public void thanDiegoWantsCreateANewProfile() {

        OnStage.theActorCalled("Diego").wasAbleTo(OpenUp.thePage());

    }


    @When("^he complete all the forms present in the profile$")
    public void heCompleteAllTheFormsPresentInTheProfile(List<DataTest> dDataTest) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                TellAboutYourself.onThePage(dDataTest.get(0)),
                AddYourAdress.onThePage(dDataTest.get(0)),
                TellAboutYourDevices.onThePage(dDataTest.get(0)),
                LastStep.createUser(dDataTest.get(0))
        );

    }

    @Then("^he use the platform$")
    public void heUseThePlatform(List<DataTest> dDataTest) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(dDataTest.get(0))));

    }


}
