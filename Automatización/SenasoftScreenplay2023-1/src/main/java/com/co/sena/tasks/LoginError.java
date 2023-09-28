package com.co.sena.tasks;

import com.co.sena.models.DataLoginError;
import com.co.sena.userinterfaces.LoginPage;
import com.co.sena.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginError implements Task {

   DataLoginError dataLoginError;

    public LoginError(DataLoginError dataLoginError) {
        this.dataLoginError = dataLoginError;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_ANUNCE),
                Click.on(MenuComponent.BTN_LOGIN),
                Enter.theValue(dataLoginError.getEmailError()).into(LoginPage.TXT_EMAIL),
                Click.on(LoginPage.BTN_EMAIL)
               );
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static LoginError enterCredentialsError(DataLoginError dataLoginError) {
        return Tasks.instrumented(LoginError.class, dataLoginError);
    }
}
