package com.co.sena.tasks;

import com.co.sena.models.DataLogin;
import com.co.sena.userinterfaces.LoginPage;
import com.co.sena.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    DataLogin dataLogin;

    public Login(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_ANUNCE),
                Click.on(MenuComponent.BTN_LOGIN),
                Enter.theValue(dataLogin.getEmail()).into(LoginPage.TXT_EMAIL),
                Click.on(LoginPage.BTN_EMAIL),
                Enter.theValue(dataLogin.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_INICIAR_SESION));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static Login enterCredentials(DataLogin dataLogin) {
        return Tasks.instrumented(Login.class, dataLogin);
    }
}
