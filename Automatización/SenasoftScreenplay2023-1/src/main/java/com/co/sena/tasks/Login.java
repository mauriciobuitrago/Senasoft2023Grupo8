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
    /*Constructor que recibe los datos de inicio de sesión y poderlos usar*/
    public Login(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        /* El actor realiza la tarea de inicio de sesión */
        actor.attemptsTo(Click.on(MenuComponent.BTN_ANUNCE), /* Clic en el botón "Anuncio" */
                Click.on(MenuComponent.BTN_LOGIN),  /* Clic en el botón "Login" */
                Enter.theValue(dataLogin.getEmail()).into(LoginPage.TXT_EMAIL), /* Ingresa el correo electrónico */
                Click.on(LoginPage.BTN_EMAIL), /*Clic en el botón para enviar el correo electrónico */
                Enter.theValue(dataLogin.getPassword()).into(LoginPage.TXT_PASSWORD), /* Ingresa la contraseña */
                Click.on(LoginPage.BTN_INICIAR_SESION)); /* Clic en el botón de inicio de sesión */

        /* tiempo de espera de la pagina web */
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    /* Método estático para crear una instancia de la tarea */
    public static Login enterCredentials(DataLogin dataLogin) {
        return Tasks.instrumented(Login.class, dataLogin);
    }
}
