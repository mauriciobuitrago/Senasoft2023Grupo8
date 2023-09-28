package com.co.sena.tasks;

import com.co.sena.models.DataErrorGmail;
import com.co.sena.userinterfaces.LoginPage;
import com.co.sena.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class GmailIncomplete implements Task {

    DataErrorGmail dataErrorGmail;

    public GmailIncomplete(DataErrorGmail dataErrorGmail) {
        this.dataErrorGmail = dataErrorGmail;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_ANUNCE),
                Click.on(MenuComponent.BTN_LOGIN),
                Enter.theValue(dataErrorGmail.getGmailIncompleto()).into(LoginPage.TXT_EMAIL),
                Click.on(LoginPage.BTN_EMAIL));

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static GmailIncomplete enterCredentialsGmail(DataErrorGmail dataErrorGmail){
        return Tasks.instrumented(GmailIncomplete.class, dataErrorGmail);
    }

}
