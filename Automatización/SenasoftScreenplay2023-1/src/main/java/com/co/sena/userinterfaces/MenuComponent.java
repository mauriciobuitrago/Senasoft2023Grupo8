package com.co.sena.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {
    public static final Target BTN_LOGIN = Target.the("Clic en botón login")
            .locatedBy("//a[@aria-label='Iniciar sesión']");
    public static final Target BTN_ANUNCE = Target.the("cerrar anuncio")
            .locatedBy("//button[@aria-label='Ignorar información sobre el inicio de sesión.']");
}
