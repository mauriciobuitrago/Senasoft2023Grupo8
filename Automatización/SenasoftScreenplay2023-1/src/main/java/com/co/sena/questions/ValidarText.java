package com.co.sena.questions;

import com.co.sena.tasks.Login;
import com.co.sena.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidarText implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LoginPage.TXT_MESSAGE).viewedBy(actor).asBoolean();
    }

    public static ValidarText compare() {
        return new ValidarText();
    }

}
