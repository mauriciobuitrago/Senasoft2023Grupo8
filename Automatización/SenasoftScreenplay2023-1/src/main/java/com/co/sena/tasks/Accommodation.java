package com.co.sena.tasks;

import com.co.sena.models.DatosAccommodation;
import com.co.sena.userinterfaces.AccommodationPage;
import com.co.sena.userinterfaces.LoginPage;
import com.co.sena.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Accommodation implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_ANUNCE),
        Click.on(AccommodationPage.BTN_COP),
                Click.on(AccommodationPage.BTN_USD),
                Click.on(AccommodationPage.TXT_DESTINATION),
                Enter.theValue("medellin").into(AccommodationPage.TXT_DESTINATION),
                Click.on(AccommodationPage.BTN_DATE_STAR),
                Click.on(AccommodationPage.TXT_DATE_STAR),
                Click.on(AccommodationPage.TXT_DATE_END),
                Click.on(AccommodationPage.BTN_OCCUOANCY),
                Click.on(AccommodationPage.TXT_ADULT)
                );

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static Accommodation enterInformation(){
        return Tasks.instrumented(Accommodation.class);
    }
}
