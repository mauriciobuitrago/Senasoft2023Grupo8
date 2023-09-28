package com.co.sena.stepsdefinitions;

import com.co.sena.models.DataErrorGmail;
import com.co.sena.models.DataLogin;
import com.co.sena.models.DataLoginError;
import com.co.sena.questions.ErrorGmail;
import com.co.sena.questions.ValidarText;
import com.co.sena.tasks.GmailIncomplete;
import com.co.sena.tasks.Login;
import com.co.sena.tasks.LoginError;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepsDefinition {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^he user enters the website$")
    public void heUserEntersTheWebsite() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));

    }

    @When("^he user enters the credentials$")
    public void heUserEntersTheCredentials(List <DataLogin> dataLoginList) {

        DataLogin dataLogin;
        dataLogin = dataLoginList.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials(dataLogin));

    }

    @Then("^he user is logged in$")
    public void heUserIsLoggedIn() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarText.compare()
        , Matchers.is(true)));

    }

    @When("^he user enters the email wrong$")
    public void heUserEntersTheEmailWrong(List <DataLoginError> dataLoginErrorList) {
        DataLoginError dataLoginError;
        dataLoginError = dataLoginErrorList.get(0);


        OnStage.theActorInTheSpotlight().attemptsTo(LoginError.enterCredentialsError(dataLoginError));

    }
    @Then("^user not logged in$")
    public void userNotLoggedIn() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ErrorGmail.compareError()
    ,Matchers.is(true)));

    }

    @When("^he user enters the wrong email structure$")
    public void heUserEntersTheWrongEmailStructure(List<DataErrorGmail> dataErrorGmailList) {
        DataErrorGmail dataErrorGmail;
        dataErrorGmail = dataErrorGmailList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(GmailIncomplete.enterCredentialsGmail(dataErrorGmail));


    }

    @Then("^he user cannot log in$")
    public void heUserCannotLogIn() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(com.co.sena.questions.GmailIncomplete.compareGmail()
                ,Matchers.is(true)));
    }

}
