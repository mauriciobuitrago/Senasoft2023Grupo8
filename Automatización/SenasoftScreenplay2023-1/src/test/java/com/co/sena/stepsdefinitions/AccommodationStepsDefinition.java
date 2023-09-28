package com.co.sena.stepsdefinitions;

import com.co.sena.tasks.Accommodation;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class AccommodationStepsDefinition {
    @When("^he user enters the information$")
    public void heUserEntersTheInformation() {

        OnStage.theActorInTheSpotlight().attemptsTo(Accommodation.enterInformation());

    }

    @Then("^he suer view information$")
    public void heSuerViewInformation() {

    }
}
