package com.co.sena.questions;

import com.co.sena.userinterfaces.AttractionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateCity implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(AttractionPage.TXT_RESULT_CITY).viewedBy(actor).asBoolean();
    }
    public static ValidateCity compareCity()
    {
        return new ValidateCity();
    }
}
