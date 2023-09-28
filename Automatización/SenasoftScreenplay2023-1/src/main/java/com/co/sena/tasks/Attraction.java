package com.co.sena.tasks;

import com.co.sena.userinterfaces.AttractionPage;
import com.co.sena.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Attraction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(MenuComponent.BTN_ANUNCE),
                Click.on(AttractionPage.BTN_ATRACCION),
                Click.on(AttractionPage.BTN_SEARCH),
                Enter.theValue("medellin").into(AttractionPage.BTN_SEARCH),
                Click.on(AttractionPage.BTN_DATE),
                Click.on(AttractionPage.TXT_DATE_STAR),
                Click.on(AttractionPage.TXT_DATE_END),
                Click.on(AttractionPage.BTN_SEARCH_ATR));
    }
    public static Attraction enterAttraction()
    {
        return Tasks.instrumented(Attraction.class);
    }
}
