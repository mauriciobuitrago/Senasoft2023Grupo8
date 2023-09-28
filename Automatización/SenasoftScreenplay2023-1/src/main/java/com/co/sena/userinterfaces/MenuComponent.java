package com.co.sena.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {

    // botón para darle clic para logearse
    public static final Target BTN_LOGIN = Target.the("Clic en botón login")
            .locatedBy("//a[@aria-label='Iniciar sesión']");
    // botón para darle clic para registrarse
    public static final Target BTN_ANUNCE = Target.the("cerrar anuncio")
            .locatedBy("//button[@aria-label='Ignorar información sobre el inicio de sesión.']");
}
