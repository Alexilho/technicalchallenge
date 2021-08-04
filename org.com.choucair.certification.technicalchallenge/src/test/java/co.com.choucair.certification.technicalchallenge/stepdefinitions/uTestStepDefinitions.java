package co.com.choucair.certification.technicalchallenge.stepdefinitions;

import co.com.choucair.certification.technicalchallenge.models.uTestData;
import co.com.choucair.certification.technicalchallenge.tasks.Join;
import co.com.choucair.certification.technicalchallenge.tasks.OpenUp;
import co.com.choucair.certification.technicalchallenge.tasks.Send;
import co.com.choucair.certification.technicalchallenge.tasks.Result;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that alexander want to join in utest$")
    public void thatAlexanderWantToJoinInUtest(List<uTestData> uTestData)
            throws Exception{
                    OnStage.theActorCalled("Alexander").wasAbleTo(OpenUp.thePage(),
                            (Join.onThePage(uTestData.get(0).getStrFirstName(),uTestData.get(0).getStrLastName(),
                                    uTestData.get(0).getStrEmail(),uTestData.get(0).getStrDateMonth(),
                                    uTestData.get(0).getStrDateDay(),uTestData.get(0).getStrDateYear(),
                                    uTestData.get(0).getStrPassword())));
    }

    @When("^he search for the complete the join request$")
    public void heSearchForTheCompleteTheJoinRequest(){
        OnStage.theActorInTheSpotlight().attemptsTo(new Send());
    }

    @Then("^he finds join request$")
    public void heFindsJoinRequest(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(new Result()));
    }
}
