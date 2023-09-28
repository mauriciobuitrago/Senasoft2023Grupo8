package com.co.sena.tasks;

import com.co.sena.models.DatosLogin;
import com.co.sena.userinterfaces.LoginPage;
import com.co.sena.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    DatosLogin datosLogin;

    public Login(DatosLogin datosLogin) {
        this.datosLogin = datosLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_ANUNCE),
                Click.on(MenuComponent.BTN_LOGIN),
                Enter.theValue(datosLogin.getEmail()).into(LoginPage.TXT_EMAIL),
                Click.on(LoginPage.BTN_EMAIL),
                Enter.theValue(datosLogin.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_INICIAR_SESION));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static Login enterCredentials(DatosLogin datosLogin) {
        return Tasks.instrumented(Login.class, datosLogin);
    }
}
