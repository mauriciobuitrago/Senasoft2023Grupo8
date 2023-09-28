package com.co.sena.stepsdefinitions;

import com.co.sena.questions.ValidateCity;
import com.co.sena.tasks.Attraction;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class AttractionStepsDefinition {
    @When("^he user search destiny$")
    public void heUserSearchDestiny() {

        OnStage.theActorInTheSpotlight().attemptsTo(Attraction.enterAttraction());

    }

    @Then("^he user views information$")
    public void heUserViewsInformation() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCity.compareCity()
                , Matchers.is(true)));
    }
}
