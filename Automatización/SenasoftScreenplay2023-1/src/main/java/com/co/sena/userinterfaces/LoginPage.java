package com.co.sena.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    /* Definición de elementos de la página de inicio de sesión

    * Campo de entrada de correo electrónico*/

    // Botón para enviar el correo electrónico
    public static final Target TXT_EMAIL = Target.the("Ingresar correo")
            .locatedBy("//input[@name='username']");
    // Botón para dar clic en el correo
    public static final Target BTN_EMAIL = Target.the("Clic en botón email")
            .locatedBy("//button[@type='submit']");
    // Campo de entrada de contraseña
    public static final Target TXT_PASSWORD = Target.the("Clic en botón email")
            .locatedBy("//input[@id='password']");

    //Botón para iniciar sesión
    public static final Target BTN_INICIAR_SESION = Target.the("Clic en botón sesion")
            .locatedBy("//button[@type='submit'  and //@class='yfCvx60qsR50VNBG15jF']");
    // Mensaje de éxito de inicio de sesión
    public static final Target TXT_MESSAGE = Target.the("gmail login exitoso")
            .locatedBy("//*[text()='Introduce tu contraseña de Booking.com para '] ");

    // Mensaje de error para Gmail no registrado
    public static final Target TXT_MESSAGE_ERROR = Target.the("Gmail sin registrar")
            .locatedBy("//p[@class='nw-step-description']");

    // Mensaje de error para estructura de correo electrónico de Gmail incorrecta
    public static final Target TXT_MESSAGE_GMAIL_ERROR = Target.the("Gmail correo incompleto")
            .locatedBy("//*[text()='Comprueba si el e-mail que has introducido es correcto']");






}
