package com.co.sena.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_EMAIL = Target.the("Ingresar correo")
            .locatedBy("//input[@name='username']");

    public static final Target BTN_EMAIL = Target.the("Clic en botón email")
            .locatedBy("//button[@type='submit']");
    public static final Target TXT_PASSWORD = Target.the("Clic en botón email")
            .locatedBy("//input[@id='password']");

    public static final Target BTN_INICIAR_SESION = Target.the("Clic en botón sesion")
            .locatedBy("//button[@type='submit'  and //@class='yfCvx60qsR50VNBG15jF']");

    public static final Target TXT_MESSAGE = Target.the("mensaje")
            .locatedBy("//*[text()='Introduce tu contraseña de Booking.com para '] ");

    public static final Target TXT_MESSAGE_ERROR = Target.the("mensaje")
            .locatedBy("//p[@class='nw-step-description']");




}
